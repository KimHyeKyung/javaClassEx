package com.javaex.ch2;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		super();
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
