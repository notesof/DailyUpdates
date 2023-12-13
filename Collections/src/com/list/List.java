package com.list;

import java.util.ArrayList;
import java.util.Iterator;

//add
//addAll
//remove 
//removeAll
//clear
//size
//contains
//containsAll
//isEmpty
//public Iterator iterator



public class List {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		System.out.println("==================================");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==================================");
		
		Iterator<Integer> iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("==================================");
		
		for(Integer i:al) {
			System.out.println(i);
		}
		
		System.out.println("==================================");
		
		System.out.println(al.contains(10));
		
		System.out.println("==================================");
		
		System.out.println(al.size());
		
		al.clear();
		
//		System.out.println(al);
		
		System.out.println("==================================");
		
		System.out.println(al.isEmpty());
		
		
		
		
	}

}
