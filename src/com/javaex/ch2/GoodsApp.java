package com.javaex.ch2;

public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods객체를 생성하고 레퍼런스 변수를 camera로 한다.
		Goods camera = new Goods();
		
		//이름:nikon, 가격:400000
		camera.setName("nikon");
		camera.setPrice(400000);
		
		System.out.println("제품이름 : "+camera.getName());
		System.out.println("제품가격 : "+camera.getPrice());
		
	}

}
