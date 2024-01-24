package com.capg;

public class sLargest {

	public static void main(String[] args) {
		
		int[] arr= {12,34,89,54,21,90,03,04,13};
		
		int lar=arr[0],slar=0;
		
		for(int i=0;i<arr.length;i++) {
			if(lar<arr[i]) {
				slar=lar;
				lar=arr[i];
			}
			
		}
		System.out.println(lar+" -----> "+slar);
		
	}
	
}
