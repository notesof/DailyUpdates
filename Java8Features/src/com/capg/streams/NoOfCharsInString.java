package com.capg.streams;

public class NoOfCharsInString {

	public static void main(String[] args) {
		
		String str="Bhavan";
		
		long count=str.chars().count();
		System.out.println(count);
		
	}
	
}
