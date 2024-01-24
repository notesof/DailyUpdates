package com.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+" "+name;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(46210582, "Bhavan"));
		al.add(new Employee(46210782, "Syed"));
		al.add(new Employee(46210735, "Manoj"));
		al.add(new Employee(46201437, "Srikara"));
		
		System.out.println(al);
		
//		Collections.sort(al,(a,b)->a.id>b.id?1:a.id<b.id?-1:0);
		Collections.sort(al, Comparator.comparing(a->a.name));
		
		System.out.println(al);
		
	}

}
