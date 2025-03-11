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
		String query3="select o.orderID,o.price,c.status,o.status from orders_8 o join customer_8 c on o.accNumber=c.customerID where o.status='Pending Payment'";
		Statement st=con.createStatement();
		ResultSet set=st.executeQuery(query3);
		while(set.next())
		{
			int orderid=set.getInt(1);
			double price=set.getDouble(2);
			String cardstatus=set.getString(3);
			String orderStatus=set.getString(4);
			if(orderStatus.equalsIgnoreCase("Pending Payment")) {
				
			String query1="insert into payment_8(orderID,Amount,cardStatus,paymentstatus)values(?,?,?,'Nil')";
			PreparedStatement statement=con.prepareStatement(query1);
			statement.setInt(1, orderid);
			statement.setDouble(2, price);
			statement.setString(3, cardstatus);
			statement.execute();
			}
		}	
	}
public static void payment() throws SQLException
{
	Connection con=DBConnection.getConnection();
	String status_check="select cardstatus,orderID from payment_8";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(status_check);
	while(rs.next())
	{
		String state=rs.getString(1);
		int id=rs.getInt(2);
		if(state.equals("inactive"))
		{
			String pay1="update payment_8 set paymentstatus='failed' where orderID=? ";
			PreparedStatement pstatement3=con.prepareStatement(pay1);
			pstatement3.setInt(1, id);
			pstatement3.executeUpdate();
			
			String query1="update orders_8 set status='OrderFailed' where orderID=? ";
			PreparedStatement pstatement2=con.prepareStatement(query1);
			pstatement2.setInt(1, id);
			pstatement2.executeUpdate();
			
			String query4="select productID,quantity from orders_8 where orderID=?";
			PreparedStatement st2=con.prepareStatement(query4);
			st2.setInt(1, id);
			ResultSet rs4=st2.executeQuery();
			
			if(rs4.next())
			{
				int pid=rs4.getInt(1);
				int updateStock=rs4.getInt(2);
				
				String productQuery="update products_8 set stock=? where productID=?";
				PreparedStatement st3=con.prepareStatement(productQuery);
				st3.setInt(1,updateStock);
				st3.setInt(2, pid);
				st3.executeUpdate();	
			}
		}
		else if(state.equals("active")){
			
			String pay="update payment_8 set paymentstatus='success' where orderID=? ";
			PreparedStatement pstatement1=con.prepareStatement(pay);
			pstatement1.setInt(1, id);
			pstatement1.executeUpdate();
			
			String query2="update orders_8 set status='OrderSuccess' where orderID=? ";
			PreparedStatement pstatement=con.prepareStatement(query2);
			pstatement.setInt(1, id);
			pstatement.executeUpdate();
			
		}
	}
}
}

