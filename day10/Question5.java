package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no.of elements");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("enter element");

			list.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(list);
		
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

	}

}
