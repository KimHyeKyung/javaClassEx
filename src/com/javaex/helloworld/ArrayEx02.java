package com.javaex.helloworld;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] leftArray = {10,20,30};
		int[] rightArray = {10,22,30};
		
		// 두 개의 배열 비교
		// 1. 두 배열의 크기(길이)가 같은지
		if(leftArray.length == rightArray.length) {
			System.out.println("두 배열의 크기가 같습니다.");
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
		System.out.println();
		
		// 2. 두 배열의 순서에 따른 값이 같은지
		for(int i=0; i<leftArray.length; i++) {
			
			if(leftArray[i] == rightArray[i]) {
				System.out.println(i+"번째의 값이 같습니다.");
			}else {
				System.out.println(i+"번째의 값이 다릅니다.");
			}
		}
		
		
	}

}
