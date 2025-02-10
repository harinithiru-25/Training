package com.celcom.assignments1;

class Dog{
	String name;
	String breed;
	
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	
	void setName(String name)
	{
		this.name=name;
		
	}
	void setBreed(String breed)
	{
		this.breed=breed;
	}
	void display()
	{
		System.out.println("Name of Dog : "+name);
		System.out.println("Name of Breed : "+breed);
	}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog("Jim","Golden Retriever");
		
		obj.display();
		obj.setBreed("Shihtzu");
		obj.setName("Tom");
		
		obj.display();
		
		

	}

}
