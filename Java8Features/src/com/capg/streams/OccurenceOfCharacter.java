package com.capg.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
       
public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
		String str="Bhavan";
		                                                               
		Map<Character,Long> map=str.chars()
				.mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
	}
	
}
