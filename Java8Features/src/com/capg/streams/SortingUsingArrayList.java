package com.capg.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("K S Reddy Prasad");
		al.add("Bhavan R S");
		al.add("Amar R");
		al.add("Venkatesh R N");
		al.add("Santosh K S");
		al.add("Venkataramanareddy C S");
		
		List<String> sort=al.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		System.out.println("-------------------");
		
		
		List<String> reverse=al.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(reverse);
		
		System.out.println("--------------------------");
		
		List<String> revOrder=al.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(revOrder);
		
		
		
	}
			

}
