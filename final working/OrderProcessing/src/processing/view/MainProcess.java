package processing.view;

import java.sql.SQLException;
import java.util.Scanner;

import processing.orders.*;

public class MainProcess {

	public static void main(String[] args) throws SQLException {
		
		ThreadProcess tp=new ThreadProcess();
		tp.threads();
		
	}
}


