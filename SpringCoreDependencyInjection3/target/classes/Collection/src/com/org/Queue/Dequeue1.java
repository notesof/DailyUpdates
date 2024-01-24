package com.org.Queue;

import java.util.*;

public class Dequeue1 {

	public static void main(String[] args) {
		
		Deque<String> qu=new ArrayDeque<String>() ;
		qu.add("a");
		qu.add("b");
		qu.add("c");
		qu.add("d");
		
		
//		qu.addFirst("Hai");
//		qu.addLast("I am Last");
//		System.out.println(qu.peekFirst());
//		System.out.println(qu.peekLast());
//		qu.push("and");
//		System.out.println(qu.getFirst());
//		System.out.println(qu.offer("i am"));
//		System.out.println(qu.spliterator());
//		System.out.println(qu.pop());
//		System.out.println(qu.remove());
//		System.out.println(qu.removeFirstOccurrence(qu));
		
		Iterator<String> i=qu.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();

			
		
	}

}
