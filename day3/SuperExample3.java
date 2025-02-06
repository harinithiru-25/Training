package com.celcom.day3;
 
class X{
	X(){
		System.out.println("A");	
	}
	X(int a){
		System.out.println("A1");
	}
}

class Y extends X{
	Y()//a constructor cannot have super() and this()
	{   this(10);
		System.out.println("B");
	}
	Y(int a)
	{
		super(10);
		System.out.println("B1");
	}
}

public class SuperExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y b= new Y();
		
	}

}
