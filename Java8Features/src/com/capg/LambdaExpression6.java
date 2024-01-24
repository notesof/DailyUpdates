package com.capg;

interface interf1{
	public int square(int x);
}

public class LambdaExpression6 {

	public static void main(String[] args) {
		
		interf1 i=x->x*x;
		System.out.println(i.square(6));
		
	}
	
}
