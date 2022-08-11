package com.javaex.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));

		System.out.println(list.get(0));//0번째 index 출력
		
		System.out.println();
		
		for(int j=0; j<list.size(); j++) {
			System.out.println(list.get(j));
		}
		
		System.out.println();
		
		//향상된for문
		for(Integer i : list) { //for문을 통한 전체출력
		    System.out.println(i);
		}

		System.out.println();
		
		Iterator iter = list.iterator(); //Iterator 선언 
		while(iter.hasNext()){//다음값이 있는지 체크 (true면 진행)
		    System.out.println(iter.next()); //값 출력
		}
		

	}

}
