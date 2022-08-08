package com.javaex.ch2;

public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods객체를 생성하고 레퍼런스 변수를 camera로 한다.
		//객체를 만들었지만 변수만 선언한것과 같이 내용이 들어가있지 않다. -> set으로 값을 넣어야한다.
		Goods camera = new Goods();
		Goods laptop = new Goods();
		Goods cup = new Goods();
//		Goods cup = new Goods("머그컵",2000);	//public Goods(String name, int price)로 만든 생성자 사용
//		
//		//이름:nikon, 가격:400000
//		camera.setName("nikon");
//		camera.setPrice(400000);
//		
//		//이름:LG그램, 가격:900000
//		laptop.setName("LG그램");
//		laptop.setPrice(900000);
//		
//		System.out.println("제품이름 : "+camera.getName());
//		System.out.println("제품가격 : "+camera.getPrice());
//		
//		System.out.println("제품이름 : "+laptop.getName());
//		System.out.println("제품가격 : "+laptop.getPrice());
//		
//		System.out.println("제품이름 : "+cup.getName());
//		System.out.println("제품가격 : "+cup.getPrice());
		
		camera.showInfo("nikon", 400000);
		System.out.println();
		laptop.showInfo("LG그램", 900000);
		System.out.println();
		cup.showInfo("머그컵", 2000);
	}

}
