package com.celcom.assignments1;

class Rectangle{
	int width;
	int height;
	
	Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	void measure()
	{
		int area=width*height;
		int perimeter=2*(width+height);
		System.out.println("Area of rectangle : "+area);
		System.out.println("Area of rectangle : "+perimeter);
		
	}
	
	
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle(12,6);
		obj.measure();

	}

}
