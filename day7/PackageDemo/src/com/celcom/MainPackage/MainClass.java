package com.celcom.MainPackage;

import com.celcom.Package1.Myclass1;
import com.celcom.Package2.MyClass2;

//Normal import
import java.lang.Math;

//static import
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class MainClass {
	static int a;

	public static void main(String[] args) {
		/*Myclass1 obj=new Myclass1();
		obj.myMethod();
		obj.myMethod2();
		
		MyClass2 obj1=new MyClass2();
		obj1.myMethod3();
		*/
		
		out.println(Math.PI);
		System.out.println(PI);
		System.out.println(a);
		
		int a=parseInt("ABC");
		

	}

}
