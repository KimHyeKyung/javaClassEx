package com.javaex.ch2;

public class ArrayException {

	public static void main(String[] args) {

		int[] intArray = {3,6,9};
		
		
		try {
			System.out.println(intArray[0]);
			System.out.println(intArray[1]);
			System.out.println(intArray[2]);
			System.out.println(intArray[3]);
		} catch (Exception e) {
			//e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}

	}

}
