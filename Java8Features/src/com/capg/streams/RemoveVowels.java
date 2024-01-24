package com.capg.streams;

import java.util.stream.Collectors;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String str="Bhavan";
		
		String vowel=
				str.chars()
				.filter(c->"aeiouAEIOU".indexOf(c)==-1)
				.mapToObj(c->String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(vowel);
		
	}
	
}
