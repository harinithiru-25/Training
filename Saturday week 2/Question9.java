package com.celcom.assignments2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no.of elements");
			int n=sc.nextInt();
			
			List<Object> list=new LinkedList<>();
			
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter element");
				list.add(sc.next());
			}
			for(int i=0;i<list.size();i++)
			{
				System.out.println("Position of " +list.get(i)+" is "+(i+1));
			}
			
	}

}
