package com.celcom.assignments1;

class Vehicle{
	void status()
	{
		System.out.println("I am driving");
	}
}

class Car extends Vehicle{
	void status()
	{
		System.out.println("Repairing Car");
	}
}

public class Question9 {

	public static void main(String[] args) {
		//Car obj1= new Car();
		Vehicle obj2= new Car();
		obj2.status();
		
	

	}

}
