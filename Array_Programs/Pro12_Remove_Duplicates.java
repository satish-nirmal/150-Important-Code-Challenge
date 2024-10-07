package com.java.arrayprograms;

import java.util.HashSet;

public class Pro12_Remove_Duplicates {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5, 4, 2, 3 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (Integer element : set) {
			System.out.print(element + " ");
		}
	}
}