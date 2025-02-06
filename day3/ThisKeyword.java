package com.celcom.day3;

public class ThisKeyword {
	String name;
	
	ThisKeyword()
	{
		this("Harini");
	}
	
	
	//IT comes to current class constructor with String argument
	ThisKeyword(String name)
	{
		this.name=name;
		this.greeting();//constructor calls the current class method using this keyword
	}
	void greeting()
	{
		System.out.println("Welcome "+ "name "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj=new ThisKeyword();
		

	}

}
