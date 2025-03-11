package processing.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GeneratingProcess {

	public synchronized static void pickOrders() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		String query="select status from orders_8 where status='NEW'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			String modify="update orders_8 set status='In Progress' where status='NEW'";
			PreparedStatement pst=con.prepareStatement(modify);
			pst.executeUpdate();
			
			String query1="select p.productID,p.stock,p.price,o.quantity,o.orderID from products_8 p join orders_8 o on p.productID=o.productID";
			PreparedStatement pst1=con.prepareStatement(query1);
			ResultSet rs1=pst1.executeQuery();
			
			if(rs1.next())
			{
				int id=rs1.getInt(1);
				long stock=rs1.getLong(2);
				double price=rs1.getDouble(3);
				int quantity=rs1.getInt(4);
				int orderid=rs1.getInt(5);
				if(quantity<stock)
				{
					String update1="update products_8 set stock=? where productID=?";
					PreparedStatement pst2=con.prepareStatement(update1);
					pst2.setLong(1,(stock-quantity));
					pst2.setInt(2, id);
					pst2.executeUpdate();
			
					String update2="update orders_8 set price=?, status=? where orderID=? ";
					PreparedStatement pst3=con.prepareStatement(update2);
					pst3.setDouble(1, (price*quantity));
					pst3.setString(2,"Pending Payment");
					pst3.setInt(3, orderid);	
					pst3.executeUpdate();
					PaymentProcess.insertPaymentDetails();
					PaymentProcess.payment();
				}
				else if(quantity>stock) {
					System.out.println("Stock not available");
					String queryOrder="update orders_8 set status='Out of Stock' where orderID=? ";
					PreparedStatement ustatement=con.prepareStatement(queryOrder);
					ustatement.setInt(1, orderid);
					ustatement.executeUpdate();
					return;
				}
			}
		}
	}
}