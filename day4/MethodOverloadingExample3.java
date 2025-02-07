package com.celcom.day4;

public class MethodOverloadingExample3 {
	
	void concatenate(int a,int b)
	{
		System.out.println("Integer Concatenation :"+a+b);
	}
	void concatenate(double a,double b)
	{
		System.out.println("Double Concatenation :"+a+b);
	}
	void concatenate(String a,String b)
	{
		System.out.println("String Concatenation :"+a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample3 obj= new MethodOverloadingExample3();
		obj.concatenate(10.0, 20.0);
		obj.concatenate(10, 20);
		obj.concatenate("Hello", "world");

	}

}
