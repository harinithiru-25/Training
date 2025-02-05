package com.celcom.day1;
import java.util.Scanner;

public class Userinput{
	public static void main(String args[]){
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter employee id,name and salary");
	  int eid=sc.nextInt();
	  String ename=sc.next();
	  double esalary= sc.nextDouble();
	  sc.close();
	  System.out.println("Employee id :"  +eid);
	  System.out.println("Employee name : " +ename);
	  System.out.println("Employee salary : " +esalary);







	}

}
