package com.capg;

public class MinAndMax {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,9,0};
		
		int max=arr[0],min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j])
				min=arr[j];
		}
		System.out.println(min);
	}

}
