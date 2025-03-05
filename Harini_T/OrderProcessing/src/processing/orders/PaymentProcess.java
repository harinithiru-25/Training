package processing.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PaymentProcess {

	public static void insertPaymentDetails() throws SQLException
	{  

		Connection con=DBConnection.getConnection();
		
		String query="select o.orderID,o.price, c.status from o.orders_8 join c.customer_8 where o.accNumber= c.customerID";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet set=pst.executeQuery();
		while(set.next())
		{
			int orderid=set.getInt(1);
			double price=set.getDouble(2);
			String cardstatus=set.getString(3);
			
			String query1="insert into payment_8(orderID,Amount,cardStatus,paymentstatus)values(?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(query1);
			statement=con.prepareStatement(query1);
			statement.setInt(1, orderid);
			statement.setDouble(2, price);
			statement.setString(3, cardstatus);
			statement.setString(4,"No status" );
			int result = statement.executeUpdate();
			if (result == 0) 
			{
				System.out.println("Please enter a valid Details");
			} 
			else {
				System.out.println("Payment details inserted");
			}
		}	
	}
	public static void payment() throws SQLException
	{
		Connection con=DBConnection.getConnection();
		String status_check="select cardstatus from payment_8";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(status_check);
		while(rs.next())
		{
			String state=rs.getString(1);
			
			if(state=="inactive")
			{
				String pay="update payment_8 set status='failed' where cardstatus='inactive'";
				Statement statement=con.createStatement();
				int result=statement.executeUpdate(pay);
				if(result==0)
				{
					System.out.println("payment status not updated");
				}
				else
				{
					String query="select orderId from payment_8 where paymentStatus='failed'";
					Statement st1=con.createStatement();
					st1.executeUpdate(query);
					ResultSet rs1=st1.executeQuery(query);
					while(rs1.next())
					{
						int id=rs1.getInt(1);
						String query1="update orders_8 set status='OrderFailed' where orderId=? ";
						PreparedStatement pstatement=con.prepareStatement(query1);
						pstatement=con.prepareStatement(query1);
						pstatement.setInt(1, id);
						pstatement.executeUpdate(query);
					}
					System.out.println("payment status updated");
				}
			}
			else {
				String pay="update payment_8 set status='success' where cardstatus='active'";
				Statement statement=con.createStatement();
				int result=statement.executeUpdate(pay);
				if(result==0)
				{
					System.out.println("payment status not updated");
				}
				else
				{
					String query="SELECT orderId from payment_8 where paymentStatus='success'";
					Statement st1=con.createStatement();
					statement.executeUpdate(query);
					ResultSet rs1=st1.executeQuery(query);
					while(rs1.next())
					{
						int id=rs1.getInt(1);
						String query1="Update orders_8 set status='OrderSuccess' where orderId=? ";
						PreparedStatement pstatement=con.prepareStatement(query1);
						pstatement=con.prepareStatement(query1);
						pstatement.setInt(1, id);
						pstatement.executeUpdate(query);
					}
					
					System.out.println("payment status updated");

				}
			}
		}
		
		
		
		
		
	}
}
