package com.celcom.day8;

public class StringMethod4 {

	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//false
		
		String s3="Java";
		String s4="Java";
		
		System.out.println(s3.equals(s4));//true
		System.out.println(s3==s4);//true

	}

}
