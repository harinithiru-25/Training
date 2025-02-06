package com.celcom.day3;

class Vehicle1{
	String name= " I am a Super Class Variable";
	
	Vehicle1()
	{
		System.out.println("I am a Super Class Constructor");
	}
	void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
}

class TwoWheeler1 extends Vehicle1{
	TwoWheeler1(){
		super();
	}
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have two Wheels");
		System.out.println(super.name);
	}


}
public class SuperExample1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler1 two=new TwoWheeler1();
		two.noOfWheels();
	}

}