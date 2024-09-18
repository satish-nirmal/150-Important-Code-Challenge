package com.java.arrayprograms;

/**
 * Question :
 * 1. Java Program to Sort the Elements of an Array in Descending Order. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro3_Decending_Array {

	public static void main(String[] args) {

		int[] a = { 14, 3, 4, 52, 24, 213, 5 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}