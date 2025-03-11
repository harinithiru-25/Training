package assessment.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import assessment.model.*;

public class OrderProcessing {

	int getnum;
	public void insertOrder() throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		System.out.println("Enter CustomerId");
		int id=sc.nextInt();
		int productId=OrderInfo.getProductId();
		if(ProductDetails.productIdCheck(productId))
		{
			String query="insert into orders_8(accNumber,productID,quantity,price,status)values(?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(query);
			statement.setInt(1,id);
			statement.setInt(2,OrderInfo.getProductId());
			statement.setInt(3,OrderInfo.getQuantity());
			statement.setDouble(4,OrderInfo.getOrderPrice());
			statement.setString(5,OrderInfo.getStatus());
			statement.executeUpdate();
			String query1="select orderID from orders_8 where ACCNUMBER=? and status='NEW'";
			PreparedStatement statement1=con.prepareStatement(query1);
			statement1.setInt(1,id);
			ResultSet rs1=statement1.executeQuery();
			if(rs1.next())
			{
				getnum=rs1.getInt(1);
				
				
			}
			System.out.println("Order created for id ="+getnum);
			ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(5);
			executor.scheduleWithFixedDelay(()->{
				try {
					if(this.checkStatus())
					{
						executor.shutdown();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			},0,60,TimeUnit.SECONDS);
			
		}
		else {
			System.out.println("Invalid Product ID");
			return;
		}
	}
	
	public boolean checkStatus() throws SQLException  {
		Connection con=DBConnection.getConnection();
		String query1="select orderID, status from orders_8 where orderID=?";
		//Statement st=con.createStatement();
		PreparedStatement st=con.prepareStatement(query1);
		st.setInt(1,getnum);
		//st.executeUpdate(query);
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			int order_num=rs.getInt(1);
			String state=rs.getString(2);
			if(state.equals("In Progress"))
			{
				System.out.println("Order number:"+order_num+" is in progress, please wait");
				return false;
			}
			if(state.equals("Pending Payment"))
			{
				System.out.println("Order number:"+order_num +" processing payment, please wait");
				return false;
			}
			if(state.equals("OrderSuccess"))
			{
				System.out.println("Order successful for "+order_num);
				displayOrder(order_num);
				return true;
			}
			if(state.equals("OrderFailed"))
			{
				System.out.println("Order failed for "+order_num);
				return true;
			}
		}
		return false;
	}
	public static void displayOrder(int order_id)throws SQLException{
		 String query = "select * from orders_8 where orderId = ?";
		 PreparedStatement st = DBConnection.getConnection().prepareStatement(query);
		 st.setInt(1,order_id);
		 ResultSet rs = st.executeQuery();
		 if(rs.next()) {

			 	int productId = rs.getInt(3);
				int quantity = rs.getInt(4);
				double amount = rs.getInt(5);
				String status = rs.getNString(6);
				double price = amount/quantity; 
				String query2 = "select producName,category from products_8 where productId = ?";
				PreparedStatement st1 = DBConnection.getConnection().prepareStatement(query2);
				st1.setInt(1, productId);
				ResultSet rs1  = st1.executeQuery();
				if(rs1.next()) {
					String name = rs1.getNString(1);
					String category = rs1.getNString(2);
					System.out.println("The order Details: \n");
					System.out.println("OrderId: "+order_id+"\n"+"ProductId: "+productId+"\n"+"Name: "+name+"\n"+"Category: "+category+"\n"+"Quantity: "+quantity+"\n"+"Price: "+price+"\n"+"Amount: "+amount+"\n"+"Status: "+status+"\n\n");
			    }
		   }
	}
}
