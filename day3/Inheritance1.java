package com.celcom.day3;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName()
	{
		System.out.println("My brand name is HONDA");
	}
}

class Scooty extends TwoWheeler{
	void brandName()
	{
		System.out.println("My brand Name is Activa");
	}
}
public class Inheritance1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike honda=new Bike();
		honda.noOfEngine();
		honda.noOfWheels();
		honda.brandName();
		
		Scooty activa=new Scooty();
		activa.brandName();
		activa.noOfEngine();t
		activa.noOfWheels();
	}

}