package com.capg;

public class ArrayReverseByRightNTimes {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int n=5;
		
		for(int j=0;j<n;j++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
			for(int i:arr) {
				System.out.println(i);
			}
		}
		
		
	}
	
}
