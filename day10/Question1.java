package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		LinkedList<Integer> list1 = new LinkedList<>(list);
		
		System.out.println(list1);
		

	}

}
