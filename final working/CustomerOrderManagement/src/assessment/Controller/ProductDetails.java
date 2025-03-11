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
			String query2="select productID from products_8 where producname=? and category=?";
			PreparedStatement st1=con.prepareStatement(query2);
			st1.setString(1,ProductInfo.getProductName());
			st1.setString(2,ProductInfo.getCategory());
			ResultSet rs=st1.executeQuery();
			while(rs.next())
			{
				int productID=rs.getInt(1);
			    System.out.println("Product inserted ID :"+productID);
			}
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
	public static boolean productIdCheck(int id) {
		String query1 = "select productId from products_8 order by productId";
		PreparedStatement statement;
		try {
			statement = DBConnection.getConnection().prepareStatement(query1);
		    ResultSet resultset = statement.executeQuery();
		    while(resultset.next()) {
		    	if(resultset.getInt(1)==id) {
		    		return true;
		    	}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}

