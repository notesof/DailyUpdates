package com.capg;

@FunctionalInterface
interface lambda1{
	public void m1();
}

public class LambdaExpression1 {

	
	
	public static void main(String[] args) {
		
		lambda1 l=()->System.out.println("m1() is implementation8u mehod of lambda1");
		l.m1();
		
		
	}

}
