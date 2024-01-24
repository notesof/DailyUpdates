package com.capg;

interface lambda3{
	public int getLength(String s);
}

public class LambdaExpression3 {

	
	public static void main(String[] args) {
		
		lambda3 l=s->s.length();
		System.out.println(l.getLength("Bhavan R S"));
	}
	
}
