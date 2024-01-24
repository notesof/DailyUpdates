package com.org.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>(); 
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
//		al.addAll(al);
//		System.out.println(al);
//		System.out.println(al.size());
//		System.out.println(al.contains(30));
//		System.out.println(al.containsAll(al));
//		al.clear();
//		al.remove(1);
//		al.removeAll(al);
//		System.out.println(al.isEmpty());
//		System.out.println(al);
		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("---------------");
//		
//		for(Integer i:al) {
//			System.out.println(i);
//		}
//		
//		System.out.println(al.iterator());
		Iterator i=al.iterator() ;
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		
		
	}

}
