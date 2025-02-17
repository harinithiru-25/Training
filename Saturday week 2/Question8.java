package com.celcom.assignments2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Question8 {

	public static void main(String[] args) {

		List<Integer> list =new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Elements :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Element "+i);

			list.add(sc.nextInt());
		}
		
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");

		}
	}

}
