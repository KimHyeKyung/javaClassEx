package com.javaex.helloworld;

import java.util.Scanner;

public class ScannerIf {

	public static void main(String[] args) {
		
//		System.out.println("점수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		if (num % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		
		System.out.print("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//경우1
//		if (num >= 90) {
//			System.out.println("A등급");
//		}else if((num >= 80) && (num <= 89)) {
//			System.out.println("B등급");
//		}else if((num >= 70) && (num <= 79)) {
//			System.out.println("C등급");
//		}else if((num >= 60) && (num <= 69)) {
//			System.out.println("D등급");
//		}else {
//			System.out.println("F등급");
//		}
		
		//경우2 -> 이게 더 간단!!
		if (num >= 90) {
			System.out.println("A등급");
		}else if(num >= 80) {
			System.out.println("B등급");
		}else if(num >= 70) {
			System.out.println("C등급");
		}else if(num >= 60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		sc.close();
	}

}
