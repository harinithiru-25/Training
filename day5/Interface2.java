package com.celcom.day5;

interface Interface5{
	int c=10;
	//By default interface variable are public static final
	
}

interface Interface4{
	int c=20;
}

interface Interface3 extends Interface5,Interface4{
	void add();
	
}

class Addition implements Interface3
{
	public void add()
	{
		System.out.println(Interface5.c+Interface4.c);
	}
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface3 obj1=new Addition();
		obj1.add();
		
	}

}
