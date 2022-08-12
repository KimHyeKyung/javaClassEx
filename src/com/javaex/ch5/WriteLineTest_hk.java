package com.javaex.ch5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLineTest_hk {

	public static void main(String[] args) throws IOException {
		 try
	        {   
	            String filePath = "D:\\javaStudy\\PhoneDB.txt";
	            FileWriter fw = new FileWriter(filePath, true); 
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.newLine();
	            String lineToAppend = "김혜경,010-1111-2222,02-2222-3333";    
	            bw.write(lineToAppend);
	            bw.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
		

	}

}
