package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
//		System.out.println("당신의 점수는 몇점입니까?");
//		System.out.println("숫자를 입력해주세요.");
		System.out.println("과목을 선택하세요.");
		System.out.println("(1.Java 2.C 3.C++ 4.Python)");
		System.out.print("과목번호:");
		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
		int subNum = sc.nextInt();
		///
/*  
		//1번
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		//2번
		if(score > 0) {
			System.out.println("양수");
		}else if(score < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}
		
		//3번
		if(score > 0) {
			if(score % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else if(score < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0입니다.");
		}
		
*/ 
		
		//4번 과목번호를 입력받아 강의실 번호를 출력하는 프로그램을 작성하세요.
		if(subNum == 1) {
			System.out.println("R101호 입니다.");
		}else if(subNum == 2) {
			System.out.println("R202호 입니다.");
		}else if(subNum == 3) {
			System.out.println("R303호 입니다.");
		}else if(subNum == 4 ) {
			System.out.println("R404호 입니다.");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		
		sc.close();
	
	}

}
