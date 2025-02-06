package com.celcom.day3;
 
class A{
	A(){
		System.out.println("A");	
	}
	A(int a){
		System.out.println("A1");
	}
}

class B extends A{
	B()/* JVM automatically ads the super() constructor even without adding,
	therefore inherits the default constructor functionality*/
	{
		System.out.println("B");
	}
	B(int a)
	{
		System.out.println("B1");
	}
}

public class SuperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B(10);// with argument
		//B c=new B(); without argument
	}

}
