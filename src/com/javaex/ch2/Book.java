package com.javaex.ch2;

public class Book {

	private String bookName;
	private String bookWriter;
	
	public Book() {
		super();
	}
	
	public Book(String bookWriter, String bookName) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	
	public void showInfo() {
		System.out.println("책[ " + bookWriter + ":" + bookName + " ]");
	}
}
