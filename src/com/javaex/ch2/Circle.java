package com.javaex.ch2;

//Shape추상클래스를 상속받음
public class Circle extends Shape implements Drawable{

	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	//Shape추상클래스의 area메서드
	@Override
	public double area() {
		return this.radius * this.radius * 3.14; 
	}

	@Override
	public void draw() {
		System.out.println("반지름이"+this.radius+"인 원을 그렸습니다.");
		
	}

	
}
