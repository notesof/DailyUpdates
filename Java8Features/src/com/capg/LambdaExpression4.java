package com.capg;

@FunctionalInterface
interface Multiplication{
	public void multiply(int a,int b);
}

public class LambdaExpression4 {

	public static void main(String[] args) {
		
		Multiplication m=(a,b)->System.out.println(a*b);
		m.multiply(10, 20);
		
	}
	
}
