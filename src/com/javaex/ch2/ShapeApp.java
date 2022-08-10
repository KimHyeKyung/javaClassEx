package com.javaex.ch2;

public class ShapeApp {

	public static void main(String[] args) {

		Ractangle r =  new Ractangle(3,4);
		Triangle t = new Triangle(3,4);
		Circle c = new Circle(3);
		
		System.out.println(r.area());
		System.out.println(t.area());
		System.out.println(c.area());
	}

}
