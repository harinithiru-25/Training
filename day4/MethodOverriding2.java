package com.celcom.day4;

class Animal{
	void move()
	{
		System.out.println("can not define");
	}
	
	void eat()
	{
		System.out.println("can not define");
	}
}

class cat extends Animal{
	void move()
	{
		System.out.println("Cat will move by walk");
	}
	void eat()
	{
		System.out.println("Cat will eat Rat");
	}
}

class parrot extends Animal{
	void move()
	{
		System.out.println("Parrot moves by flying");
	}
	void eat()
	{
		System.out.println("Parrot will eat Fruits");
	}
}

class fish extends Animal{
	void move()
	{
		System.out.println("fish moves by swimming");
	}
	void eat()
	{
		System.out.println("fish will eat seaplants");
	}
}
public class MethodOverriding2 {
	
	public static void main(String[] args) {
		Animal animal;
		
		animal=new cat();
		animal.move();
		animal.eat();
		
		animal=new parrot();
		animal.move();
		animal.eat();
		
		animal=new fish();
		animal.move();
		animal.eat();
		

	}

}
