package com.javaex.ch5;

import java.io.File;
import java.io.FileReader;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			// 파일 객체 생성
			File file = new File("D:\\javaStudy\\workspace\\javaEx\\src\\com\\javaex\\ch5\\Output.txt");
			
			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			int cur = 0;									// 파일의 위치를 읽어주는 용도 (얼만큼 읽었다 이런거)
			while ((cur = file_reader.read()) != -1) {		// while을 통해서 끝까지 읽도록 함
				System.out.print((char) cur);
			}
			file_reader.close();							// 닫기
		} catch (Exception e) {								// Exception은 최상위 클래스
			e.getStackTrace();
		}
	}

}
