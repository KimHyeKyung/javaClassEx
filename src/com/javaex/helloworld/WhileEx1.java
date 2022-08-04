package com.javaex.helloworld;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		//1. while문을 이용한 반복문
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");

		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int i = 1;
		
		while (i < 10) {
			System.out.println(dan + " * " +  i + " = " + dan*i);
			i++;
		}
		
		sc.close();
		
	}

}
