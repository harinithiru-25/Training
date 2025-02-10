package com.celcom.assignments1;

class Animal{
	void makeSound()
	{
		System.out.println("noise");
	}
	
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("bark");
	}
	
}
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Cat();
		obj.makeSound();

	}

}
