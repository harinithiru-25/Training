package com.celcom.assignments1;

class Employee{
	String name;
	String title;
	double basepay;
	double bonus;
	
	Employee(String name,String title,double basepay,double bonus)
	{
		this.name=name;
		this.title=title;
		this.basepay=basepay;
		this.bonus=bonus;
	}
	void calculate() {
		double salary=basepay+bonus;
		System.out.println("Salary : "+salary);
	}
	void setUpdate(double basepay,double bonus)
	{
		this.basepay=basepay;
		this.bonus=bonus;
	}
}


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("Harini","Trainee",5000000.0,50000);
		
		obj.calculate();
		
		obj.setUpdate(6000000.0,100000.0);
		obj.calculate();

	}

}