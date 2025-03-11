package assessment.view;

import assessment.Controller.*;
import assessment.model.*;

import java.sql.SQLException;
import java.util.Scanner;

public class MainManagement{

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		OrderProcessing orderProcess=new OrderProcessing();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1.Insert Customer Details");
			System.out.println("2.Insert Product Details");
			System.out.println("3.Insert Order Details");
			System.out.println("4.Calculate Order Details");
			System.out.println("5.Exit");

			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter Customer details");
				System.out.println("FirstName|LastName|MobileNum|Email|PaymentChoice|Card status");
				CustomerInfo customer=new CustomerInfo(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
				CustomerRegistration.insertCustomer();
				break;
				
			case 2:
				System.out.println("Enter product details:");
				System.out.println("ProductName||,Category(Electronics||Clothing||Groceries)||,Price,||Stock");
				ProductInfo product=new ProductInfo(sc.next(),sc.next(),sc.nextDouble(),sc.nextLong());
				ProductDetails.insertProduct();
				break;
			
			case 3:
				ProductDetails.showProducts();
				System.out.println("Enter Order details:");
				System.out.println("Category || Product ID || Quantity");
				OrderInfo order=new OrderInfo(sc.next(),sc.nextInt(),sc.nextInt());
				orderProcess.insertOrder();
				break;
								
			case 5:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid Option");
				
			}
		}while(choice!=5);		
	}

}
