package com.javaex.ch2;

public class ColorPoint extends Point{

	private String color;

	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}

	public ColorPoint(int x, int y) {
		super(x,y);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showInfo() {
		System.out.println("Point [x=" + super.getX() + ", y=" + super.getY() + ", 색상=" +  this.color +"]");
	}
	

}
