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
	
	//Point 클래스에 점을 안보일 수 있는 기능까지 추가된 draw() 메소드를 하나 더 추가하고 아래 실행결과가 나도록 테스트 하세요
	public void draw(Boolean deleteYN) {
		//if deleteYN이 true일때 실행
		if(deleteYN) {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 지웠습니다.");
		}else {
			System.out.println("지우기 실패 하였습니다.");
		}
		
	}

	public void showInfo() {
		this.draw();
	}
	
}
