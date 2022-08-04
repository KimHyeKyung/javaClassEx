package com.javaex.helloworld;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//1부터 20까지의 수에서 2의배수와 3의배수를 제외한 숫자를 출력하세요
//		for(int i = 1; i <= 20; i++) {
//			
//			if((i % 2 == 0 || i % 3 == 0)) {
//				continue;
//			}else {
//				System.out.println(i);
//			}
//			
//		}
		

		//6의 배수이자 14의 배수인 가장 작은 정수찾기
		//반복문의 횟수를 알 수 없다 -> while문으로 돌리자
		int i = 1;
		int count = 0;
		
		while(true) {
			if(i % 6 == 0 && i % 14 == 0) {
				System.out.println(i);
				count++;
				if(count == 10) {
					break;
				}
			}
		//i의 값을 계속 높여주면서 무한반복 시켜야한다!!
		i++;
		}
		
	}
	
}
