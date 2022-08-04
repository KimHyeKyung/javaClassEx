package com.javaex.helloworld;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {

		//2. for문을 이용한 반복문
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");

		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();

		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " +  i + " = " + dan*i);
		}
		
		sc.close();
		
	}

}
