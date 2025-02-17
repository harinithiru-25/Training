package com.celcom.assignments2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<Object>list =new ArrayList<>();
		
		System.out.println("Enter no.of elements");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element");
			list.add(sc.next());
		}
		
		Collections.reverse(list);
		System.out.print(list);
		
	}

}
