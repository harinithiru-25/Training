package com.celcom.day5;

//Interface
interface VehiclePlan1{
	void noOfEngine();//public abstract
	
}

interface VehiclePlan2{
	void noOfWheels();
	void brandName();
	
}



//Abstract class
abstract class Vehicle1 implements VehiclePlan1,VehiclePlan2 {
	public void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	//abstract void noOfWheels();we can remove because already declared in interface
	
	//abstract void brandName();//abstract method
	//we can remove because already declared in interface
}

class Car1 extends Vehicle1{
	public void noOfWheels()
	{
		System.out.println("I have four wheels");
	}
	public void brandName()
	{
		System.out.println("My brand Name Benz");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vec= new Car1();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();


	}

}
