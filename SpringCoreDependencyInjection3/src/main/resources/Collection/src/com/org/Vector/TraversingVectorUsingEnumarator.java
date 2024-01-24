package com.org.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class TraversingVectorUsingEnumarator {
	
	public static void main(String[] args) {
		
		Vector vector=new Vector();
		vector.add(100);
		vector.add("hii");
		vector.add(200);
		vector.add("Hello");
		System.out.println(vector);
		
		Enumeration enumeration=vector.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}

}
