package com.javaex.ch2;

public class NullPointException {

	public static void main(String[] args) {

		String str = new String("Hello");
		str = null;

		try {
			if(str.equals("")) { //Exception 발생함 null.equals() 시도시 발생
				str = "null";
			}
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println("null");
			str = "null";
		}
		System.out.println(str.toString());
	}

}
 