package com.celcom.day4;

public class ConstructorOverloading1 {
	
	ConstructorOverloading1(int a,int b)
	{
		this(10L, 20L);
		System.out.println("Integer Addition :" +(a+b));
	}
	ConstructorOverloading1(double a,double b)
	{
		this(10,20);
		System.out.println("Double Addition :" +(a+b));
	}
	ConstructorOverloading1(long a,long b)
	{
		System.out.println("Long Addition :" +(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorOverloading1 obj1=new ConstructorOverloading1(10,20);
		ConstructorOverloading1 obj2=new ConstructorOverloading1(10.0,20.0);
		//ConstructorOverloading1 obj3=new ConstructorOverloading1(10L,20L);
		

	}

}

