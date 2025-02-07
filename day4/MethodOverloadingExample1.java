package com.celcom.day4;

public class MethodOverloadingExample1 {
	
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial :" +fact);
	}
	void myMethod(int a,int b)
	{
		int sum= a+b;
		System.out.println("Sum :" +sum);
	}
	void myMethod(String name)
	{
		System.out.println("Welcome "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample1 obj=new MethodOverloadingExample1();
		obj.myMethod(10, 20);
		obj.myMethod("Harini");
		obj.myMethod(5);

	

	}

}
