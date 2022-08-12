package com.javaex.ch5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputBufferedStreamEX {

	public static void main(String[] args) throws IOException {
		
		//BufferedOutputStream을 활용한 txt 파일로 데이터 저장하기
		//FileReader 대신에 버퍼를 활용하는것이 더 효율적이다.
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream(
					"D:\\javaStudy\\workspace\\javaEx\\src\\com\\javaex\\ch5\\Output2.txt"));
			String str = "내일 날씨는 아주 좋습니다.";
			bs.write(str.getBytes()); // Byte형으로만 넣을 수 있음

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			bs.close();
		}

	}

}
