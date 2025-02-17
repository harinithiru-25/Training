package com.celcom.assignments2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 implements Cloneable {

	public static void main(String[] args)throws CloneNotSupportedException {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> list= new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		sc.close();
		ArrayList<Object> list1=new ArrayList<>();
		
		/*for(Object i:list)
		{
			list1.add(i);
		}*/
		list1=(ArrayList<Object>)list.clone();
		System.out.println(list1);

	}

}
