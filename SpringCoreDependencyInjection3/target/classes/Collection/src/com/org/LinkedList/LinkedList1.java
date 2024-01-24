package com.org.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Rohit");
		ll.add("k.l");
		ll.add("Virat");
		ll.add("Pant");
		ll.add("SKY");
		ll.add("Jaddu");
		System.out.println(ll);
		System.out.println("------------");
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Hardik");
		ll2.add("Shardul");
		ll2.add("Deepak");
		ll2.add("Bumrah");
		ll2.add("Bishnoi");
		ll.addAll(ll2);
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains("Hardik"));
		System.out.println(ll.containsAll(ll2));
//		ll2.clear();
		System.out.println(ll2);
		System.out.println(ll2.isEmpty());
//		ll.remove(3);
//		ll.removeAll(ll2);
		System.out.println(ll);
		System.out.println("=========================");
		
		
		Iterator<String> i=ll.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("=================");
		
		for(int i1=0;i1<ll.size();i1++) {
			System.out.println(ll.get(i1));
		}
		

//		for(String s:ll) {
//			System.out.println(ll);
//		}
		
		String[] array=(String[]) ll2.toArray(new String[ll2.size()]);
		for(String i1:array) {
		System.out.println(i1);
		}
	}
}
