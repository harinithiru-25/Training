package com.celcom.day2;

class Employee{
	int eid;
	String ename;
	double salary;
	
	
	//Constructor
	Employee(int id,String name,double sal)
	{
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	//Method
	void display() {
		System.out.println("Employee id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+salary);
		
	}
}



public class ClassAndObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee valan = new Employee(101,"valan",15000);
		valan.display();
		System.out.println();
		Employee harini = new Employee(101,"Harini",20000);
		harini.display();
		

	}

}
