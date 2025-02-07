package com.celcom.day4;

class SuperClass{
	void myMethod() {
		System.out.println("I am from Super Class");
	}

}

class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("I am from Sub Class");
	}

}
public class MethodOverriding1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj=new SubClass();
		obj.myMethod();
		
		SuperClass obj1=new SubClass();
		//superclass reference and subclass object-DMD
		//overriding is based on object
		obj1.myMethod();

	}

}
