package com.celcom.assignments2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question10 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Object> list = new LinkedList<>();
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element");

			list.add(sc.next());
			
		}
		LinkedList<Object> list1=new LinkedList<>();
		//List<Object> list1=new LinkedList<>(list);
		
		list1= (LinkedList<Object>)list.clone();
		
		/*Iterator<Object> it=list.iterator();
		while(it.hasNext())
		{
			list1.add(it.next());
		}*/
		System.out.print("Copied list is:" +list1);
	}

}
