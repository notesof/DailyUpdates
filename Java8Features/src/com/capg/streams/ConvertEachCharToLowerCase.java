package com.capg.streams;

import java.util.stream.Collectors;

public class ConvertEachCharToLowerCase {
	
	public static void main(String[] args) {
		
		String str="Bhavan";
		
		String low=
				str.chars()
				.mapToObj(c -> Character.toLowerCase((char) c))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println(low);
	}

}
