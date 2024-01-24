package com.capg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Sorting {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 54, 3, 2);

		List<Integer> sort = l.stream().sorted().collect(Collectors.toList());

		System.out.println("Ascending order " + sort);

		System.out.println("------------------------");

		List<Integer> revSort = l.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());

		System.out.println("Descending order : " + revSort);

		System.out.println("------------------------");

		Long cnt = l.stream().count();
		System.out.println("Count : " + cnt);

		System.out.println("------------------------");

		Integer min = l.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("Minimum value : "+min);
		
		Integer max=l.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Maximum Value : "+max);
		
		System.out.println("------------------------");
		
		l.stream().forEach(a->System.out.println(a));
		
		System.out.println("------------------------");
		
		l.stream().forEach(System.out :: println);
		
		System.out.println("------------------------");
	
		List<Integer> fil=l.stream().filter(a->(a+1==5) || (a+2==5)).collect(Collectors.toList()); 
		System.out.println(fil);
		
		System.out.println("------------------------");
		
		List<Integer> map=l.stream().map(a->a*5).collect(Collectors.toList());
		System.out.println(map);
		
		System.out.println("------------------------");
		
		List<Integer> dis=l.stream().distinct().collect(Collectors.toList());
		System.out.println(dis);
		
		int sum1=l.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum1);
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		int sum=IntStream.of(a).sum();
		System.out.println(sum);
		
				
		
	}
	

}
