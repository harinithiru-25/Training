package com.celcom.day4;

public class JavaBlock1 {
	{
		System.out.println("Instance Block");
	}
	JavaBlock1()
	{
		System.out.println("Constructor");
	}
	@Override // from object cls
	public String toString() {
		return "To String";
		
	}
	
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Block");
		JavaBlock1 obj= new JavaBlock1();
		System.out.println(obj);

	}

}
