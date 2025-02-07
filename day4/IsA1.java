package com.celcom.day4;

class Vehicle{
	void engine() {
		System.out.println("All vehicle has a one engine");
	}
	void wheel()
	{
		System.out.println("All vehicle has a Wheels");
	}
	
}

class Wheels{
	void wheelModel()
	{
		System.out.println("Wheel model is MRF");
	}
	void noOfwheels(String vehicleType)
	{
		if(vehicleType.equals("Two Wheeler"))
		{
			System.out.println("I have Two wheels");
		}
		else if(vehicleType.equals("Four Wheeler"));
		{
			System.out.println("I have Two wheels");
		}
	}
}
class Engine{
	void engineModel()
	{
		System.out.println("Engine model is XYZ");
	}

}

class Car extends Vehicle{
	//IS-A
	Wheels wheel=new Wheels();//HAS-A
	Engine engine=new Engine();//HAS-A
	
	void engineModel()
	{
		engine.engineModel();
	}
	void wheelModel()
	{
		wheel.wheelModel();
	}
	void noOfWheels()
	{
		System.out.println("Four Wheeler");
	}
}

public class IsA1 {

	public static void main(String[] args) {
		Car car=new Car();
		car.engine();
		car.engineModel();
		
		car.wheel();
		car.wheelModel();
		car.noOfWheels();
		

	}

}
