package com.capg;

interface lambda2{
	public void add(int a,int b);
}

public class LambdaExpression2 {
	
	public static void main(String[] args) {
		
		lambda2 l=(a,b)->System.out.println(a+b);
		l.add(10,20);
	}

}
