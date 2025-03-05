package assessment.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import assessment.model.*;

public class ProductDetails {

	public static void insertProduct() throws SQLException {
		Connection con=DBConnection.getConnection();
		
		String query="insert into products_8(producName,category,price,stock)values(?,?,?,?)";
		
		PreparedStatement statement=con.prepareStatement(query);
		statement.setString(1,ProductInfo.getProductName());
		statement.setString(2,ProductInfo.getCategory());
		statement.setDouble(3,ProductInfo.getPrice());
		statement.setLong(4,ProductInfo.getStock());
		
		
		int result = statement.executeUpdate();

		if (result == 0) 
		{
			System.out.println("Please enter valid Details");
		} 
		else {
			System.out.println("Product details inserted");
		}
	}
	public static void showProducts() throws SQLException {
		String show="select * from products_8";
		
		Statement st=DBConnection.getConnection().createStatement();
		st.executeUpdate(show);
		
		ResultSet rs=st.executeQuery(show);
		System.out.println(" PRODUCT ID | PRODUCT Name | Category | Price | Stock ");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
	}
}

