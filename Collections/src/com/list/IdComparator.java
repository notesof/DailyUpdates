package com.list;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2) {
		if(e1.getEmpId()==e2.getEmpId()) {
			return 0;
		}else if(e1.getEmpId()>e2.getEmpId()) {
			return 1;
		}else {
			return -1;
		}
	}

	

}
