package assessment.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import assessment.model.*;

public class OrderProcessing {

	public static void insertOrder() throws SQLException {
		
		Connection con=DBConnection.getConnection();
		
		String query="insert into orders_8(accNumber,productID,quantity,price,status)values(?,?,?,?,?)";
		
		PreparedStatement statement=con.prepareStatement(query);
		statement.setInt(1,OrderInfo.getAccNumber());
		statement.setInt(2,OrderInfo.getProductId());
		statement.setInt(3,OrderInfo.getQuantity());
		statement.setDouble(4,OrderInfo.getOrderPrice());
		statement.setString(5,OrderInfo.getStatus());
		
		int result = statement.executeUpdate();

		if (result == 0) 
		{
			System.out.println("Order not created");
		} 
		else {
			System.out.println("New Order Created");
		}
	}
	
	public static void checkStatus() throws SQLException  {
		Connection con=DBConnection.getConnection();
		String query="select orderID, status from orders_8 ";
		Statement st=con.createStatement();
		st.executeUpdate(query);
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			int order_num=rs.getInt(1);
			String state=rs.getString(2);
			if(state=="In Progress")
			{
				System.out.println("Order number:"+order_num+"is in progress, please wait");
			}
			if(state=="Pending Payment")
			{
				System.out.println("Order number:"+ order_num +"processing payment, please wait");
			}
			if(state=="success")
			{
				System.out.println("Order successful");
				break;
			}
			if(state=="failed")
			{
				System.out.println("Order failed");
				break;
			}
			
		}
	}
}