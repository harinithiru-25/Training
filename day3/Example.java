package com.celcom.day3;
import java.util.Scanner;
public class Example {
	String brand;
	String color;
	double price;
	
	Example(String brand, String color, double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	void display()
	{
		System.out.println("Brand of Mobile :" +brand);
		System.out.println("Color of Mobile :" +color);
		System.out.println("Brand of Mobile :" +price);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj1= new Example("Samsung","Red",50000);
		
		obj1.display();
		

	}

}
