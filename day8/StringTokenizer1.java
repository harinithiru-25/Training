package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String s1="Welcome to Java Programming";
		StringTokenizer1 st=new STringTokenizer1(s1," ");
		System.out.println(st.countTokens());//4
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
		

	}

}
