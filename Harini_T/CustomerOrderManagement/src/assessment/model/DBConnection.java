package assessment.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBConnection {
	private static String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static String userName = "training";
	private static String password = "Celcom123";
	
 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);

	}
 
}