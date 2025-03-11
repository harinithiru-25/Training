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
			System.out.println("Please enter a valid Customer Details");
		} 
		else {
			String query2="select customerID from customer_8 where mobilenumber=?";
			PreparedStatement st1=con.prepareStatement(query2);
			st1.setString(1,CustomerInfo.getMobileNum());
			ResultSet rs=st1.executeQuery();
			while(rs.next())
			{
				int customerID=rs.getInt(1);
			    System.out.println("Customer Registered ID:"+customerID);
			}
		}
	}
}
