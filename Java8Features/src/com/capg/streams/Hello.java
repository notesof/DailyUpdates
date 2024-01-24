package com.capg.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {
	
	public static void main(String[] args) {
		
		String str="Bhavan";
		
//		Stream<Character> charStream = str.chars() // IntStream of characters
//				.mapToObj(c -> (char) c); // Convert to Stream<Character>
//
//		Stream<Character> distinctCharStream = charStream.distinct();
//		
//		String distinctChars = distinctCharStream.map(String::valueOf) // Convert to Stream<String>
//				.collect(Collectors.joining()); // Join the characters into a single string
//
//		System.out.println(distinctChars);

		String s=str.chars()
				.mapToObj(c->(char)c)
				.distinct()
				.sorted((a,b)->b.compareTo(a))
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println(s);
		
		
		

		
		
	}

}
