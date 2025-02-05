package com.celcom.day1;
import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		int choice;

		
		do {
			System.out.println("Enter choice");
			choice = sc.nextInt();
			System.out.println("Enter two numbers");
			int num1= sc.nextInt();
			int num2= sc.nextInt();
			

			switch(choice){
			case 1:
				int sum= num1+num2;
				System.out.println("Addition : " +sum);
				break;
			case 2:
				int sub=num1-num2;
				System.out.println("Subtraction : " +sub);
				break;
			case 3:
				int mul=num1*num2;
				System.out.println("Multiplication : " +mul);
				break;
			case 4:
				double div=num1/num2;
				System.out.println("Division : " +div);
				break;
			case 5:
		    	break;
		    	
		}
			//System.out.println(choice);
		}while(choice!=5);

			
		
	}

}
