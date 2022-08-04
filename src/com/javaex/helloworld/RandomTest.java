package com.javaex.helloworld;

public class RandomTest {

	public static void main(String[] args) {
		
		//Math.random() 형식 -> int num = (int)(Math.random()*최대값)+최소값;
		//Math.random()은 정수형을 반환한다.
		for(int count = 1; count <= 6; count++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+" ");
		}
		
		
	}

}
