package com.javaex.helloworld;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
//		for(int i = 0; i < 3; i++) {
//			 System.out.print(intArray[i]);
//		}
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
			System.out.print(intArray[i]);
		}

	}

}
