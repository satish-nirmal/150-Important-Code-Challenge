package com.java.arrayprograms;

import java.util.Arrays;

public class Pro8_MergeTwoArray_WithoutUsing_Predefined {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };

		int a1 = a.length;
		int b1 = b.length;

		int c1 = a1 + b1;

		int[] c = new int[c1];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {
			c[j + a.length] = b[j];
		}

		System.out.println("The Merged Array is : " + Arrays.toString(c));
	}

}
