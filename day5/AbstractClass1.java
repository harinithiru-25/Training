package com.celcom.day5;

//Abstract class
abstract class Vehicle{
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	abstract void noOfWheels();
	
	abstract void brandName();//abstract method
}

class Car extends Vehicle{
	void noOfWheels()
	{
		System.out.println("I have four wheels");
	}
	void brandName()
	{
		System.out.println("My brand Name Benz");
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vec= new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
	}
}