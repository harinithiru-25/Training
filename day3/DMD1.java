package com.celcom.day3;

//Dynamic Method Dispatch[DMD]

class Vehicle{
	
}
class Bike extends Vehicle{
	
}
class Car extends Vehicle{
	
}

public class DMD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		Vehicle vec=new Bike(); //DMD
		
		vec=new Car();//assigning subclass object to superclass reference

	}

}
