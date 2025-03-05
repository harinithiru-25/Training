package assessment.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import assessment.model.*;

public class CustomerRegistration {

	public static void insertCustomer() throws SQLException {
		Connection con=DBConnection.getConnection();
		
		String query="insert into customer_8(firstName,lastName,mobileNumber,email,paymentChoice,status)values(?,?,?,?,?,?)";
		
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1,CustomerInfo.getFirstName());
		statement.setString(2,CustomerInfo.getLastName());
		statement.setString(3,CustomerInfo.getMobileNum());
		statement.setString(4,CustomerInfo.getEmail());
		statement.setString(5,CustomerInfo.getPaymentChoice());
		statement.setString(6, CustomerInfo.getCardStatus());
		
		int result = statement.executeUpdate();

		if (result == 0) 
		{
			System.out.println("Please enter a valid Details");
		} 
		else {
			System.out.println("Customer details inserted");
		}
	}
	
	//to make customerID alphanumeric
	public static void updateId()throws SQLException
	{
		Connection con=DBConnection.getConnection();
		String query1= "select customerID from customer_8 where mobileNumber=?";
		PreparedStatement statement1=con.prepareStatement(query1);
		statement1.setString(1,CustomerInfo.getMobileNum());
		ResultSet set=statement1.executeQuery();
		while(set.next())
		{
			int id=set.getInt(1);
			String new_id="HTshop"+id;
			//System.out.println(set.getInt(1));
			String updation="update customer_8 set customerID=? where id=? ";
			PreparedStatement pst=con.prepareStatement(updation);			
			pst.setString(1,new_id);
			pst.setInt(2, id);	
			int r=pst.executeUpdate();
			if(r==0)
			{
				System.out.println("not updated");
			}
			else {
				System.out.println("updated");
			}
		}
		
		
	}
}
