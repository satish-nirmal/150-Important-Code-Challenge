package com.java.arrayprograms;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size of Array");

		int arrSize = sc.nextInt();

		int arr[] = new int[arrSize];

		arr[0] = 12;
		arr[1] = 1;

		for (int a : arr) {

			System.out.println(a);
		}

//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println(arr[i]);
//		}

		sc.close();
	}

	static {
		System.err.println("Hello From Static ");
	}
}
