package com.celcom.assignments2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f=true;
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int s=sc.nextInt();
		
		for(Integer i:list) {
			if(s==i) {
				System.out.println("Element found" + i);
				f=true;
				break;
			}
			
			
		}
	}

}
