package com.celcom.day7;

interface Calculator{
	int calc(int a,int b);
}

//uses anonymous class and lambda expression
public class CalculatorLamba {

	public static void main(String[] args) {
		Calculator c=(a,b) -> a+b;
		c.calc(10,20);//30
		
		c=(a,b) -> a-b;
		c.calc(10,20);//-10
	}

}
