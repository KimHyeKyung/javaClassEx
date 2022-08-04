package com.javaex.helloworld;

import java.util.Scanner;

public class DoWhileEx01 {

	//사용자의 숫자를 입력받아 더하는 프로그램을 작성하세요
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.(0이면 종료)");

		do {
			int num = sc.nextInt();
			sum = sum + num;
			
			if(num == 0) {
				break;
			}
			System.out.println("합계 : "+sum);
		} while(true);
		
	}
}
