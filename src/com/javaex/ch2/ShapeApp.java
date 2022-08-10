package com.javaex.ch2;

public class ShapeApp {

	public static void main(String[] args) {

		Ractangle r =  new Ractangle(3,4);
		System.out.println(r.area());
		
		Triangle t = new Triangle(3,4);
		System.out.println(t.area());

		Circle c = new Circle(3);
		System.out.println(c.area());
		
		
		//**instanceof**
		//자식클래스의 레퍼런스 변수를 부모클래스에 담는다(업캐스팅) -> 주소를 찾아가면 되니깐 가능
		Shape c1 = new Circle(5);
		
		// c1 객체가 Circle 클래스의 인스턴스 인가?
		// true
	    System.out.println( c1 instanceof Circle );
	    
	    // c1 객체가 Drawable 인터페이스를 구현하였는가?
	    // true
	    System.out.println( c1 instanceof Drawable );
	    
	    // 객체가 Rectangle 클래스의 인스턴스 인가?
	    // false
	    System.out.println( c1 instanceof Ractangle );
	    
	    // 객체가 Shape 클래스의 인스턴스 인가?
	    // true
	    System.out.println( c1 instanceof Shape ); 

	    //test1. shape는 밑에 3개를 담을 수 있다.
//	    Shape s1 = r;
//	    Shape s2 = c1;
//		Shape s3 = t;
//		Shape s4 = new Point(1,2); Point객체는 연결이 안되어있기 때문에 오류가 난다.
		
		//test2. test1을 배열화
		Shape[] shapeArr = {r,c1,t};
		for(int i=0; i<shapeArr.length; i++) {
			if(shapeArr[i] instanceof Ractangle) {
				System.out.println("사각형의 면적은" + shapeArr[i].area());
			}else if(shapeArr[i] instanceof Triangle) {
				System.out.println("삼각형의 면적은" + shapeArr[i].area());
			}else if(shapeArr[i] instanceof Circle) {
				System.out.println("원의 면적은" + shapeArr[i].area());
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
