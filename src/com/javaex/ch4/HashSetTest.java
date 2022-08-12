package com.javaex.ch4;

import java.util.HashSet;

//HashSet : 중복저장이 안된다!!
public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>(6);
		
		for(int i=0; i<6; i++) {
			int lotto = (int)(Math.random() * 45) + 1;
			hashSet.add(lotto);
		}
		System.out.print(hashSet + " ");
		
	}
}
 

