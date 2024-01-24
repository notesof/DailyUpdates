package com.org.ArrayList;

import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListAddAndRemove {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayListAddAndRemove=new ArrayList<Integer>();
		arrayListAddAndRemove.add(100);
		arrayListAddAndRemove.add(200);
		arrayListAddAndRemove.add(300);
		arrayListAddAndRemove.add(400);
		arrayListAddAndRemove.add(500);
		arrayListAddAndRemove.add(600);
		System.out.println(arrayListAddAndRemove);
		arrayListAddAndRemove.remove(2);
		System.out.println(arrayListAddAndRemove);
		
		for(Integer i:arrayListAddAndRemove) {
			System.out.println(i);
		}
	}

}
