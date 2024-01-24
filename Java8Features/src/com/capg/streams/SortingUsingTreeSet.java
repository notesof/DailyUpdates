package com.capg.streams;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingUsingTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> tr=new TreeSet<>((a,b)->-a.compareTo(b));
		tr.add("Z");
		tr.add("B");
		tr.add("A");
		tr.add("K");
		tr.add("L");
		tr.add("M");
		
		System.out.println(tr);
		
		System.out.println("-----------------------------");
		
		List<String> list = tr.stream().distinct()
				.sorted(/* Collections.reverseOrder() */).collect(Collectors.toList());
		
		System.out.println(list);
		
	}
	
}
