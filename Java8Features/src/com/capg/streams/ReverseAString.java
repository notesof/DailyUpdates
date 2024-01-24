package com.capg.streams;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str="Bhavan";
		
		String rev=new StringBuilder(str).reverse().toString();
		System.out.println(rev);
		
	}
	
}
