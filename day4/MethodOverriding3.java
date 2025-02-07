package com.celcom.day4;

class Animal1{
	int a=10;//variable is not declared then compile time error
	void move()
	{
		System.out.println("can not define");
	}
	
	
}

class cat1 extends Animal1{
	int a=20;
	void move()
	{
		System.out.println("Cat will move by walk");
	}
	/*void eat() cannot be referenced using animal.eat()
	because super cls does not have eat method*/
	
}

public class MethodOverriding3{
	
	public static void main(String[] args) {
		Animal1 animal=new cat1();
		animal.move();
		
		System.out.println(animal.a);//10 because variable cannot be override
}
}