package com.celcom.assignments1;

class Person{
	String name;
	int age;
	
	
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Person Name : "+name);
		System.out.println("Person Age : "+age);
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person("Harini",21);
		
		obj.display();

	}

}
