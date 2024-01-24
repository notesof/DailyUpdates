package com.org.Set;

import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(50);
		ts.add(30);
		ts.add(20);
//		System.out.println(ts.subSet(10, 29));
		System.out.println(ts.first());
//		System.out.println(ts.retainAll(null));
		
		
	}

}
