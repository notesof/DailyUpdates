package com.capg;

import java.util.Scanner;

public class ArrayOccurence {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size=scn.nextInt();
		
		int[] arr= new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
		for(int a=0;a<arr.length;a++) {
			int count=0;
			
			for(int b=0;b<arr.length-1;b++) {
				if(arr[a]==arr[b]) {
					count++;
				}
				
			}
			System.out.println(arr[a]+" is repeated for "+count+" times");
		}
		
	}
	
}
