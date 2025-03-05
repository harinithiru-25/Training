package processing.view;

import java.sql.SQLException;
import java.util.Scanner;

import processing.orders.*;

public class MainProcess {

	public static void main(String[] args) throws SQLException {

		ThreadProcess tp= new ThreadProcess();
		tp.threads();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Change status");
		System.out.println("2.Checkstock");
		System.out.println("3.End Process");
		System.out.println("4.Exit");
		
		int choice;
		
		do {
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				GeneratingProcess.pickOrders();
				break;
			case 2:
				GeneratingProcess.checkStock();
				break;
			case 3:
				GeneratingProcess.endProcess();
			case 4:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid Option");
				
			}
		}while(choice!=4);		
	}

}


