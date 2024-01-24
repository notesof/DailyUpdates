package com.capg;

import java.util.Collections;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		java.util.TreeSet<Integer> t=new java.util.TreeSet<>((a,b)->(a>b)?-11:(a<b)?11:0);
		t.add(10);
		t.add(0);
		t.add(5);
		t.add(15);
		t.add(25);
		t.add(20);
		System.out.println(t);
		
		
		System.out.println(t);
		
	}

}
