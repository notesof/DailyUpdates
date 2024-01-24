package com.capg;

interface Interf{
	public void add(int a , int b);
}

public class LambdaExpression5 {

	public static void main(String[] args) {
		
		Interf interf=(a,b)->System.out.println(a+b);
		interf.add(10, 20);
		
	}
	
}
