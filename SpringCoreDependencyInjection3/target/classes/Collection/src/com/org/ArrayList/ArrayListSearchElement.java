package com.org.ArrayList;

import java.util.ArrayList;

public class ArrayListSearchElement {
	
	public static void main(String[] args) {
		
		ArrayList<Double> arrayList=new ArrayList<Double>();
		arrayList.add(1.0);
		arrayList.add(2.0);
		arrayList.add(3.0);
		arrayList.add(4.0);
		arrayList.add(5.0);
		System.out.println(arrayList);
		
		System.out.println(arrayList.contains(3.0));
	}

}
