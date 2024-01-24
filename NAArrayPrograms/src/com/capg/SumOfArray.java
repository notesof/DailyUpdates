package com.capg;

public class SumOfArray {
	
	int [] arr= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	
	public static void main(String[] args) {
		
		SumOfArray a=new SumOfArray();
		
		for(int i=0;i<a.arr.length;i++) {
			a.sum=a.sum+a.arr[i];
		}
		System.out.println(a.sum);
		
	}

}
