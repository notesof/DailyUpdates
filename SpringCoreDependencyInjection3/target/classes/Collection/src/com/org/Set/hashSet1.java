package com.org.Set;

import java.util.*;

public class hashSet1 {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("And");
		s.add("Bond");
		s.add("Cat");
		
//		System.out.println(s.retainAll(s));
		
//		Iterator i=s.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		System.out.println(s.contains("And"));
		
		
	}

}
