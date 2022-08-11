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
		
		
		String greeting = "Hello JAVA!";
		System.out.println(greeting.substring(1,3));
		System.out.println(greeting.substring(0,11));
		
		String str = "JAVA Programming"; 
		
		//String을 배열로 돌리려면 .length가 아닌 .length()란 메서드로 써야한다!
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			System.out.print(" ");
		}
		
		System.out.println();
		
		//문자열의 특정 문자를 다른 문자로 바꾸려면 replace를 써야한다!
		String fruits = "apple mango banana";
		System.out.println(fruits.replace(" ", ",")); 
		
		
		
		
		
		
	}
	
	
	
	
	
}
