package com.capg.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutStreamsEvenNol {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);
		
//		System.out.println(l);
		
		/*
		 * for(Integer i:l) { if(i%2==0) { System.out.println(i); } }
		 */
		
//		List<Integer> l1=l.stream().filter(a->a%2==0).collect(Collectors.toList());
//		System.out.println(l1);
//		
		List<Integer> l2=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l2);
//		
//		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("Minimum value is "+min);
//		
//		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
//		System.out.println("Minimum value is "+max);
//		
//		l.stream().forEach(s->System.out.println(s));
//		
//		l.stream().forEach(System.out :: println);
		
//		Integer[] array=l.stream().toArray(Integer[] :: new);
//		for(Integer a:array) {
//			System.out.println(a);
//		}
		
		
	}

}
