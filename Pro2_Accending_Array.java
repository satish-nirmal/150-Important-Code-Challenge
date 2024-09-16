package com.java.arrayprograms;

/**
 * Question :
 * 1. Java Program to Sort the Elements of an Array in Ascending Order. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro2_Accending_Array {

	static void accending(int arr[], int length) {

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { -5, -9, 8, 12, 1, 3 };

		int length = arr.length;

		accending(arr, length);
	}

}
