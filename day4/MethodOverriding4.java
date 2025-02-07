package com.celcom.day4;

class Animal2//if final keyword the cannot be inherited
{
	String msg=getMessage();
	
	String getMessage() //if final keyword added,it can't be overridden by subclass
	{
		return "A";
	}
}
class Cat2 extends Animal2{
	String getMessage()//this will override the animal class method
	{
		return "B";
	}
}
public class MethodOverriding4 {

	public static void main(String[] args) {
		
		Animal2 animal=new Cat2();
		System.out.println(animal.msg);
		//method is override even though msg variable is called using superclass reference
		//If we create object for animal then the output is "A"
	}

}
