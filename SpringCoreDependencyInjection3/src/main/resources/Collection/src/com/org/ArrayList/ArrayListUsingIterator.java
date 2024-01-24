package com.org.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayListString=new ArrayList<String>();
		arrayListString.add("A");
		arrayListString.add("B");
		arrayListString.add("C");
		arrayListString.add("D");
		
		Iterator<String> iterator=arrayListString.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
