package com.javaex.ch2;

public class DrawApp {

	public static void main(String[] args) {
		Drawable[] drawArr = new Drawable[4];
		drawArr[0] = new Point(5,10);
		drawArr[1] = new Ractangle(5,10);
		drawArr[2] = new Triangle(5,10);
		drawArr[3] = new Circle(5);
		
		for(int i=0; i<drawArr.length; i++) {
			drawArr[i].draw();
		}
		
		
	}

}




