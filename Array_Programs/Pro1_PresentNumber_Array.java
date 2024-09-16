package com.java.arrayprograms;

/**
 * Question :
 * 1. Check if a value is present in an Array in Java. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro1_PresentNumber_Array {

	static void check(int[] arr, int isValuePresent) {

		boolean flag = false;

		for (int element : arr) {

			if (element == isValuePresent) {
				flag = false;

			}
		}
		System.out.println("Is " + isValuePresent + " value are Presnt in Array : " + flag);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 78, };

		int isValuePresent = 7;

		check(arr, isValuePresent);

	}
}
