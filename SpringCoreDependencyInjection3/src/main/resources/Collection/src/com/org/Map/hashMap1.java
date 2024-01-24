package com.org.Map;

import java.util.*;

public class hashMap1 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "aa");
		hm.put(2, "bb");
		hm.put(3, "cc");


		Set s = hm.entrySet();
//		
//		for(Object m:s)
//			System.out.println(m);

		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
