package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter");
		int num=sc.nextInt();
		int i=1;
		int fac=1;
		while(i<=num)
		{
				fac=fac*i;
				System.out.println("Factorial of " +i +" is : " +fac);
				i++;
				
		}
		
		


	}

}
