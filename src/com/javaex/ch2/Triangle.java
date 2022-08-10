package com.javaex.ch2;

//Shape추상클래스를 상속받음
public class Triangle extends Shape{

	private int width;
	private int height;
	
	
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}


	//Shape추상클래스의 area메서드
	@Override
	public double area() {
		return (this.width * this.height) / 2;
	}
	
}
