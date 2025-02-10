package com.celcom.assignments1;

class Shape{
	
	void getArea() {
		
	}
}

class Rectangle1 extends Shape{
	int length;
	int breadth;
	
	Rectangle1(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void getArea()
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
		
	}
}

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1=new Rectangle1(2,3);
		obj1.getArea();

	}

}
