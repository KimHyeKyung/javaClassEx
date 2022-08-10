package com.javaex.ch2;

public class PhoneApp {

	public static void main(String[] args) {
		Telephone t = new Telephone("02-1234-5678");
		t.power(true);
		t.call("010-1234-1234");
		
		Smartphone s = new Smartphone("010-1234-1234", false);
		s.turnOn(true);
		s.call("119");
		s.searchInternet("http://www.naver.com");
	}

}
