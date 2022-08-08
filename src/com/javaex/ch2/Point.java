package com.javaex.ch2;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		//this.x라고 this라고 쓰는 것이 더 명확하다.
		System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
	}
	
	
}
