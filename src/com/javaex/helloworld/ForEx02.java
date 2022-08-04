package com.javaex.helloworld;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//while(true)형식은 무한반복의 의미
		while(true) {
			System.out.println("숫자를 입력해주세요");

			//입력받는 부분을 while안쪽으로 가져와야 입력받는 부분을 파악하고 while을 돌린다.
			int num = sc.nextInt();

			//0이 입력되면 탈출해야한다는 문장
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			
			if(num % 3 == 0) {
				System.out.println("3의배수");
			}else {
				System.out.println("3의배수가 아닙니다.");
			}
			
		}
		
		sc.close();
		
	}

}
