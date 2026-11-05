package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCountString {

	public static void main(String[] args) {
		String str = "swiss";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
	}

}
