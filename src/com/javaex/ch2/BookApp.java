package com.javaex.ch2;

public class BookApp {

	public static void main(String[] args) {

		Book book1 = new Book("이문열", "삼국지");
		Book book2 = new Book("박경리", "토지");
		
		book1.showInfo();
		book2.showInfo();

	}

}
