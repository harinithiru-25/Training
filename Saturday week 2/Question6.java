package com.celcom.assignments2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		List<Object> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element");
			list.add(sc.next());

		}
		Iterator<Object> it= list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));

		}
		
		

		
	}

}
