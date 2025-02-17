package com.celcom.assignments2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		List<Object> list=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element");
			list.add(sc.next());

		}
		System.out.println("Enter element position");
		int position=sc.nextInt();
		
		System.out.println(list.get(position-1));

		
		

	}

}
