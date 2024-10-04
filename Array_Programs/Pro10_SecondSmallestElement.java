package com.java.arrayprograms;

import java.util.Arrays;

public class Pro10_SecondSmallestElement {
	
	public static void main(String[] args) {
		  
		
		int a[] = {1,2,3,4,5,6};
		
		int k = 2;
		
		Arrays.sort(a);
		
//		int n = a.length;
		
		System.out.println("Second Largest Element in array : "+ a[k-1]);
	}

}
