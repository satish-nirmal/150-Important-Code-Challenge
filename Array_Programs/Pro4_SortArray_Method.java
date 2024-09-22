package com.java.arrayprograms;

import java.util.Arrays;

public class Pro4_SortArray_Method {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 2, 3, 46, 78, 2 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
