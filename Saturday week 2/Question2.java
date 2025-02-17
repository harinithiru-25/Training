package com.celcom.assignments2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter element"+i);
			int n=sc.nextInt();
			list.add(n);
		}
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(21);
		
		list.sort(null);
		
		System.out.println(list);
	}

}
