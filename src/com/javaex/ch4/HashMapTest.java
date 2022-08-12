package com.javaex.ch4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();//HashMap생성
		
		//HashMap은 순서가 없어서 key,value로 이루어진다.
		//값 추가 .put(key, value)
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("mango", "망고");
		
		//값 가져오기 & 출력
		String s = map.get("apple");
		System.out.println(s);
		
		//entrySet() 활용
		for (Entry<String, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		//KeySet() 활용
		for(String key : map.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + key + " [Value]:" + map.get(key));
		}
		
		//entrySet().iterator()
		Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<String, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		
		//keySet().iterator()
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		
		
	}
}
