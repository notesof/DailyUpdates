package com.capg.streams;

import java.util.stream.IntStream;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str="BhavanavahB";
		
		boolean isPalindrome=IntStream.range(0, str.length()/2)
				.allMatch(c->str.charAt(c)==str.charAt(str.length()-1-c));
		
		System.out.println(isPalindrome);
		
	}

}
