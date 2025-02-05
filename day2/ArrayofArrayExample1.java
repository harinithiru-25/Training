package com.celcom.day2;

public class ArrayofArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		System.out.println("Column and row need not be of same size ");
		//Column size can be dynamically changed
		int arrtwo[][]= {{1,2},{3,4,5,6},{7,8,9}};
		for(int i=0;i<arrtwo.length;i++)
		{
			for(int j=0;j<arrtwo[i].length;j++)
			{
				System.out.print(arrtwo[i][j]+ " ");
			}
			System.out.println();
			
		}
			

	}

}
