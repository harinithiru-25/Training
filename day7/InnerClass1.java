package com.celcom.day7;

//Inner class
public class InnerClass1 {
	
	//Non-static InnerClass
	
	class InClass1{
		void myMethod1()
		{
			System.out.println("Non-static Inner Class");
		}
	}
	//Static InnerClass
	static class InClass2 {
		void myMethod1()
		{
			System.out.println("Static inner Class");
		}
	}
	
	void myMethod() {
	
	//Local InnerClass
	class InClass3{
		void myMethod3(){
			System.out.println("Local Inner class");
			
		}
	}
	InClass3 inner3=new InClass3();
	inner3.myMethod3();
	}
	
	//Anonymous Interface
	interface MyInterface{
		void display();
	}
	public static void main(String[] args) {
	
		InnerClass1 obj1=new InnerClass1();
		InClass1 inner1=obj1.new InClass1();
		inner1.myMethod1();
		
		InnerClass1.InClass2 inner2=new InnerClass1.InClass2();
		inner2.myMethod1();
		
		//Anonymous Class
				
		MyInterface obj2=new MyInterface() {
			public void display() {
				System.out.println("Display");
				
				
			}
		};
		obj2.display();
		
		//Lambda Expression
		MyInterface obj3=()->System.out.println("Display Lambda");
		obj3.display();
		
		
		

	}

	}
