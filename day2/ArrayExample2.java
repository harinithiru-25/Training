package com.celcom.day2;
import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];
		int sum =0,evenCount=0,oddCount=0;
		
		System.out.println("Initial Values of Array: ");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values");
		for(int index=0;index<arr.length;index++)
		{
			arr[index]=sc.nextInt();
		}
		sc.close();
		for(int index=0;index<arr.length;index++)
		{
			sum+=arr[index];
			if(arr[index]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("SUM is : " +sum);
		System.out.println("Even Count : " +evenCount);
		System.out.println("Odd Count : " +oddCount);
		
	}

}
