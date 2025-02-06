package com.celcom.day3;

import java.util.Scanner;

class Shape{
	int length;
	int breadth;
	double radius;
	double base;
	double height;
	
	Shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	Shape(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	Shape(double radius)
	{
		this.radius=radius;
	}
	void calculateArea()
	{
		
	}
	
}

class Circle extends Shape
{
	Circle(double radius)
	{
		super(radius);
	}
	void calculateArea()
	{
		double area= 3.14*radius*radius;
		System.out.println("Area of Circle is :" +area);
	}
	
}

class Rectangle extends Shape
{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	void calculateArea()
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle is :" +area);
	}
}

class Triangle extends Shape{
	Triangle(double base,double height)
	{
		super(base,height);
	}
	void calculateArea()
	{
		double area=0.5*base*height;
		System.out.println("Area of Triangle is :" +area);
	}
}

public class Assignment {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		if(choice==1) {
			double radius=sc.nextDouble();
			Shape obj=new Circle(radius);
			obj.calculateArea();
		}
		else if(choice==2)
		{
			double base=sc.nextDouble();
			double height=sc.nextDouble();
			Shape obj=new Triangle(base,height);
			obj.calculateArea();
		}
		else if(choice==3)
		{
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			Shape obj=new Rectangle(length,breadth);
			obj.calculateArea();
		}
		
	}

}
