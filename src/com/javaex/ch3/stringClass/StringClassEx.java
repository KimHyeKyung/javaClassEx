package com.javaex.ch3.stringClass;

public class StringClassEx {
	public static void main(String[] args) {
		String str1, str2, str3;

		str1 = "abc";
		str2 = "cde";
		str3 = str2;
		
		str2 = str1.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}
	
	
	
	
	
}
