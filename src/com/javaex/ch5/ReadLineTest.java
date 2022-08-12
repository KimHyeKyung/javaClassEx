package com.javaex.ch5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineTest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\javaStudy\\PhoneDB.txt");
		if (file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String sLine = null;
			
			while ((sLine = inFile.readLine()) != null) {
				String[] temp = new String(sLine).split(",");
				
				System.out.println("이름: " + temp[0]);
				System.out.println("핸드폰: " + temp[1]);
				System.out.println("회사: " + temp[2]);
				System.out.println();
			}
					
		}
	}

}
