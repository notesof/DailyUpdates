package com.capg;

class Myrunnable implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child Thread");
		}
	}
}

public class MultiThreadingwithoOutLambdaExprn {

	public static void main(String[] args) {
		
		Runnable r=new Myrunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}
