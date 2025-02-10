package com.celcom.day5;

import java.util.Scanner;

interface Area{
	void calculateArea();
}
interface Perimeter extends Area{
	void calculatePerimeter();
	
}


abstract class Shape implements Area,Perimeter{
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
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	
}

class Circle extends Shape
{
	Circle(double radius)
	{
		super(radius);
	}
	public void calculateArea()
	{
		double area= 3.14*radius*radius;
		System.out.println("Area of Circle is :" +area);
	}
	public void calculatePerimeter()
	{
		double perimeter= 2*3.14*radius;
		System.out.println("Perimeter of Circle is :" +perimeter);
	}

	
}

class Rectangle extends Shape
{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	public void calculateArea()
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle is :" +area);
	}
	public void calculatePerimeter()
	{
		int perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle is :" +perimeter);
	}
}

class Triangle extends Shape{
	Triangle(double base,double height)
	{
		super(base,height);
	}
	public void calculateArea()
	{
		double area=0.5*base*height;
		System.out.println("Area of Triangle is :" +area);
	}
	public void calculatePerimeter()
	{
		double perimeter=3.0*base;
		System.out.println("Perimeter of Triangle is :" +perimeter);
	}
}

public class AbstractInterface2 {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		if(choice==1) {
			double radius=sc.nextDouble();
			Shape obj=new Circle(radius);
			obj.calculateArea();
			obj.calculatePerimeter();
		}
		else if(choice==2)
		{
			double base=sc.nextDouble();
			double height=sc.nextDouble();
			Shape obj=new Triangle(base,height);
			obj.calculateArea();
			obj.calculatePerimeter();
		}
		else if(choice==3)
		{
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			Shape obj=new Rectangle(length,breadth);
			obj.calculateArea();
			obj.calculatePerimeter();
		}
		
	}

}


