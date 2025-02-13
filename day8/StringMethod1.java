package com.celcom.day8;

public class StringMethod1 {

	public static void main(String[] args) {
		String s1="Java";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.concat("World"));
		System.out.println(s1.replace('a', 'z'));
		
		System.out.println(s1.equals("java"));
		System.out.println(s1.equalsIgnoreCase("java"));
		System.out.println(s1.contains("av"));
		System.out.println(s1.startsWith("Ja"));
		System.out.println(s1.endsWith("va"));

		String s2="Java World";
		System.out.println(s2.substring(2,7));
		System.out.println(s2.substring(2));



		



		



	}

}
