package com.celcom.day2;

public class TypesOfVariable {
	int b=20;//Instance or Object Variable
	static int c=0;//static or class variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//Local Variable
		System.out.println(a);
		
		TypesOfVariable obj =new TypesOfVariable();
		System.out.println(obj.b);
		
		System.out.println(TypesOfVariable.c);
		

	}

}
