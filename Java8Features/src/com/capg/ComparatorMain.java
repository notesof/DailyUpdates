package com.capg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(5);
		al.add(25);
		al.add(20);
		
		System.out.println(al);
		
		Collections.sort(al);
//		Collections.sort(al,new ComparatorMainMyComparator());
		Collections.sort(al,(I1,I2)->(I1<I2?1000:I1>I2?-12312:0)); // Using Comparator Functional Interface 
		
		System.out.println(al);                               
		
	}

}
