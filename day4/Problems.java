package com.celcom.day4;
import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int j=1;
		int t=n;
		while(i!=2)
		{
			if(n%j==0)
			{
				n=n/j;
				i++;
				if(n%(j+1)==0)
				{
					i++;
					System.out.println("Pronic number is :"+t);
				}
			}
			j++;
			
		}

	}

}
