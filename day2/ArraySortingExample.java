package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {

	public static void main(String[] args) {
		int arr[]= {2,6,7,8,9,5};
		
		Arrays.sort(arr);
		
		//Ascending order
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i] + " ");
		
		}
		System.out.println("Minimum Value : " +arr[0]);
		System.out.println("Maximum Value : " +arr[arr.length-1]);
		
		//Descending order
		for(int i=arr.length-1;i>=0;i--)
		{	
			System.out.print(arr[i] + " ");
		
		}
		
	}

}
