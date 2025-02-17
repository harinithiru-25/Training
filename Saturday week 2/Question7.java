package com.celcom.assignments2;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		List<Integer> list =new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter element"+i);

			list.add(sc.nextInt());
	
		}
		System.out.println("Enter The Position");

		int index=sc.nextInt();
		
		for(int i=index;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		sc.close();

		
	}

}
