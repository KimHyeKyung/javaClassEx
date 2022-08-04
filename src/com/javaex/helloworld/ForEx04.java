package com.javaex.helloworld;

public class ForEx04 {
	public static void main(String[] args) {
		//구구단 출력
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + "*" + j + "= " + i*j);
//			}
//		}
		
		
		//별찍기
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
