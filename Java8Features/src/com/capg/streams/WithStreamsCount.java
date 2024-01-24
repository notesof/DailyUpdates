package com.capg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamsCount {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("Pavan");
		l.add("RaviTeja");
		l.add("Chiranjeevi");
		l.add("Venkatesh");
		l.add("Nagarjuna");

		System.out.println(l);

		/*
		 * for(Integer i:l) { if(i%2==0) { System.out.println(i); } }
		 */

		Long l1 = l.stream().filter(a -> a.length() >= 9).count();
		System.out.println(l1);
	}

}
