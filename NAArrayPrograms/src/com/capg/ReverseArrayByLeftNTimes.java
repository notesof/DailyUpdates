package com.capg;

public class ReverseArrayByLeftNTimes {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		int n=4;
		
		for(int j=0;j<n;j++) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
	}
	
}
