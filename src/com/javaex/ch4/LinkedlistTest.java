package com.javaex.ch4;

import java.util.LinkedList;

public class LinkedlistTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();	//타입설정 int타입만 가능
		
		//자신이 원하는 장소에 값을 넣기가 좋다.
		list.add(3);
		list.addFirst(2);
		list.add(1,10);
		list.addLast(100);
		
		System.out.println(list);

	}

}
