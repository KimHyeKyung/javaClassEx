package com.javaex.ch5;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEX {

	// I/O 특히!! 파일을 다룰때는 try/catch를 써야한다
	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream(
					"D:\\javaStudy\\workspace\\javaEx\\src\\com\\javaex\\ch5\\Output.txt");
			String str = "오늘 날씨는 아주 좋습니다."; // 내가 작성할 내용
			byte[] by = str.getBytes(); // str문자열을 byte배열로 바꾼다.
			out.write(by);
		} catch (Exception e) { // Exception은 최상위 클래스
			e.getStackTrace();
		}

	}

}
