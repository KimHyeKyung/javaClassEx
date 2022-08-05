package com.javaex.ch2;

public class Car {
	//멤버변수->일반적으로 private로
	private String name;
	private int speed;
	
	//기본생성자(기본생성자는 리턴값이 없다.)
	public Car() {
		super();
	}
	
	//인자값이 있는 생성자
	public Car(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

	
}
