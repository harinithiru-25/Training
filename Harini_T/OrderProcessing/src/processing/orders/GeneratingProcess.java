package processing.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GeneratingProcess {

	public static void pickOrders() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		String query="select status from orders_8 where status='NEW' ";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		if(rs.next())
		{
			String modify="update orders_8 set status='in progress'";
			PreparedStatement pst=con.prepareStatement(modify);
			int result=pst.executeUpdate();
			if(result==0)
			{
				System.out.println("Not modified");
			}
			else {
				System.out.println("Status modified");
			}
		}
	}
	public static void checkStock() throws SQLException{
		Connection con=DBConnection.getConnection();
		String query="select p.productID,p.stock,p.price,o.quantity,o.orderID from products_8 p join orders_8 o where p.productID=o.productID";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt(1);
			long stock=rs.getLong(2);
			double price=rs.getDouble(3);
			int quantity=rs.getInt(4);
			int orderid=rs.getInt(5);
			
			if(quantity<=stock)
			{
				String update1="update products_8 SET stock=? where productID=?";
				pst=con.prepareStatement(update1);
				pst.setLong(1,(stock-quantity));
				pst.setInt(2, id);
				String update2="update orders_8 set price=?, status=? where id=? ";
				pst=con.prepareStatement(update2);
				pst.setDouble(1, (price*quantity));
				pst.setString(2,"Pending Payment");
				pst.setInt(3, orderid);	
			}
			else {
				System.out.println("Stock not available");
				return;
			}
		}
	}
	
	public static void endProcess() throws SQLException
	{
		PaymentProcess.insertPaymentDetails();
		PaymentProcess.payment();
	}
}