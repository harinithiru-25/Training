package com.celcom.day9;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;


public class LinkedList1 {

	public static void main(String[] args) {
		//List list=new ArrayList();
		List<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		//list.add("Java");
		list.add(10);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.add(1,15);
		System.out.println(list);
		list.set(1, 150);
		
		System.out.println(list);

		list.remove(new Integer(10));// now object is passed
		System.out.println(list);
		
		list.remove(0);//considers index
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains(20));
		
		System.out.println(list.isEmpty());
		
		//Traversal
		//WAY-1
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//Way-2
		
		for(Integer i:list)
		{
			System.out.println(i);

		}
		//Way-3
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


		

		
	}

}
