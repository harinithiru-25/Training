package com.celcom.day8;

public class StringMethod2 {

	public static void main(String[] args) {
		String s1="Java";
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		char ch[]=s1.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		String s2="Welcome to java programming";
		String temp[]=s2.split(" ");
		for(String s:temp) {
			System.out.println(s);
		}

	}

}
