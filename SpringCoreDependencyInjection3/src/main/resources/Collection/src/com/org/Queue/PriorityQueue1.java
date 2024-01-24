package com.org.Queue;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
//		System.out.println(q.element());
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		System.out.println(q.remove());
		
		Iterator i=q.iterator() ;
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(Integer i1:q) {
			System.out.println(i1);
		}
		
//		System.out.println(q);
		
	}

}
