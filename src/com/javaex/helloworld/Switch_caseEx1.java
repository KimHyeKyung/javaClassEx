package com.javaex.helloworld;

import java.util.Scanner;

public class Switch_caseEx1 {

	public static void main(String[] args) {
		
		//과목을 입력받아 강의실 번호를 출력하는 프로그램
//		System.out.println("과목을 선택하세요.");
//		System.out.println("(1.Java 2.C 3.C++ 4.Python)");
//		System.out.print("과목번호:");
//		Scanner sc = new Scanner(System.in);
//		int subNum = sc.nextInt();
//
//		switch(subNum) {
//		case 1:
//			System.out.println("R101호 입니다.");
//			break;
//		case 2:
//			System.out.println("R202호 입니다.");
//			break;
//		case 3:
//			System.out.println("R303호 입니다.");
//			break;
//		case 4:
//			System.out.println("R404호 입니다.");
//			break;
//		//default: 해당 내용이 없을때 실행내용
//		default:
//			System.out.println("상담원에게 문의하세요");
//		}
//		
//		sc.close();
		
		
		//월을 입력받아 해당월의 일수를 출력하는 프로그램
		System.out.println("월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

//		switch(month) {
//		case 1:
//			System.out.println("31일 입니다.");
//			break;
//		case 2:
//			System.out.println("28일 입니다.");
//			break;
//		case 3:
//			System.out.println("31일 입니다.");
//			break;
//		case 4:
//			System.out.println("30일 입니다.");
//			break;
//		case 5:
//			System.out.println("31일 입니다.");
//			break;
//		case 6:
//			System.out.println("30일 입니다.");
//			break;
//		case 7:
//			System.out.println("31일 입니다.");
//			break;
//		case 8:
//			System.out.println("31일 입니다.");
//			break;
//		case 9:
//			System.out.println("30일 입니다.");
//			break;
//		case 10:
//			System.out.println("31일 입니다.");
//			break;
//		case 11:
//			System.out.println("30일 입니다.");
//			break;
//		case 12:
//			System.out.println("31일 입니다.");
//			break;
//		}
		
		//이렇게 변형 가능
		//break를 만나면 swithch를 나와버리기 때문에 간결하게 줄일 수 있다.
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 입니다.");
			break;
			
		case 2:
			System.out.println("28일 입니다.");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 입니다.");
			break;
		}
		sc.close();
	}

}
