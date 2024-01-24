package com.capg.streams;

import java.util.stream.Collectors;

public class ConvertEachCharToUpperCase {
	
	public static void main(String[] args) {
		
		String str="Bhavan";
		
		String upper=
				str.chars()
				.mapToObj(c -> Character.toUpperCase((char) c))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println(upper);
//				
//				str.chars()
//			    .mapToObj(c -> Character.toUpperCase((char) c))
//			    .map(String::valueOf)
//			    .collect(Collectors.joining());
	}

}
