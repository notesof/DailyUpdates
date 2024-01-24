package com.capg;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tr=new TreeMap<>((a,b)->a<b?11:a>b?-11:0);
		tr.put(1, "Amar");
		tr.put(9, "Venkatesh");
		tr.put(03, "Bhavan");
		tr.put(06, "Reddy");
		tr.put(07, "Santosh");
		System.out.println(tr);
		
	}
	
}
