package com.celcom.day5;

interface AnimalPlan{
	abstract void move();
	abstract void eat();

}

abstract class Animal implements AnimalPlan{
	abstract public void move();
	abstract public void eat();
	
}

class cat extends Animal{
	public void move()
	{
		System.out.println("Cat will move by walk");
	}
	public void eat()
	{
		System.out.println("Cat will eat Rat");
	}
}

class parrot extends Animal{
	public void move()
	{
		System.out.println("Parrot moves by flying");
	}
	public void eat()
	{
		System.out.println("Parrot will eat Fruits");
	}
}

class fish extends Animal{
	public void move()
	{
		System.out.println("fish moves by swimming");
	}
	public void eat()
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
