package com.capg;

import java.util.Comparator;

public class ComparatorMainMyComparator implements Comparator<Integer> {
	
	public int compare(Integer cm1,Integer cm2) {
		/*
		 * if(cm1==cm2) { return 0; } else if(cm1<cm2) { return 1; }else { return -100;
		 * }
		 */
		return cm1<cm2?1:cm1>cm2?-1:0;
	}

	

}
