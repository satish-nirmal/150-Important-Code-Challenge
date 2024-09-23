package com.java.arrayprograms;

/**
 * Question :
 * 1. Java Program to Find the Largest element in array. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro5_Largest_Element {

	public static void main(String[] args) {

		int arr[] = { 1, 43, 2, 45, 34, 567, 64 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
