package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		List<Integer> list1= new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element for 1");
			list1.add(sc.nextInt());
		}
		
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element for 2");
			list2.add(sc.nextInt());
		}
		
		list1.sort(null);
		list2.sort(null);
		if(list1.equals(list2)) {
			System.out.println("Both List are Same");
		}
		else {
			System.out.println("Both list are not same");
		}
		sc.close();
		
	}

}
