package com.celcom.assignments1;

class Circle{
	double radius;
	
	
	Circle(double radius)
	{
		this.radius=radius;
		
	}
	void area()
	{
		double area=3.14*radius*radius;
		System.out.println("Area : "+area);
	}
	void circumference()
	{
		double circumference=2*3.14*radius;
		System.out.println("Circumference : "+circumference);
	}
	
}

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(5);
		obj.area();
		obj.circumference();

	}

}
