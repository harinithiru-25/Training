package com.celcom.day3;

public class ThisKeyword2 {
	//Constructor Calling should be the 1st Statement in a constructor
	
	ThisKeyword2(){
		this("Harini");
		System.out.println("A");
	}
	ThisKeyword2(String name)
	{
		this(10);
		System.out.println("B");
	}
	ThisKeyword2(int a)
	{
		System.out.println("C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword2 obj1=new ThisKeyword2();

	}
}
