package com.org.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Double> lhs=new LinkedHashSet<Double>();
		
		lhs.add(10.0);
		lhs.add(20.0);
		lhs.add(30.0);
		lhs.add(40.0);
		
		System.out.println(lhs);
		
		Iterator i=lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("--------------------------");
		
		for(Double d:lhs) {
			System.out.println(d);
		}
		
		
		
		
		
	}

}
