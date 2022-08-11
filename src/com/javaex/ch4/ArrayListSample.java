package com.javaex.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListSample {

	public static void main(String[] args) {
		String [] data = {"138","129","142"};

		//위의 data배열을 .add하지않고 Arrays.asList()를 이용해서 넣을 수 있다.
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
//		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","142"));
/*
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		pitches.add(0,"133");
		pitches.add(1,"133");
		
		System.out.println(pitches);
		System.out.println(pitches.get(2));
		System.out.println(pitches.size());
		
		//contains() -> 값이 있는지 없는지 true/false로 나타내준다.
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.contains("141"));
		
		// 같은 remove이지만 결과가 다르게 나타난다.
		System.out.println(pitches.remove("133"));	// 수행결과를 true/false로 나타낸다
		System.out.println(pitches.remove(0));		// 수행결과를 지운 인자값으로 나타낸다.
*/		
		
		
		//[133,129,142]처럼 나타내지말고 133,129,142로 나타내라
		String result = String.join(",", pitches);
		System.out.println(result);
		
		String result2 = String.join(",", data);	//배열에도 가능하다.
		System.out.println(result2);
		
		//리스트 정렬하기
		pitches.sort(Comparator.naturalOrder());	//오름차순으로 정렬
		pitches.sort(Comparator.reverseOrder());	//내림차순으로 정렬
		System.out.println("order이후: " + pitches);
		
		
	}
}
