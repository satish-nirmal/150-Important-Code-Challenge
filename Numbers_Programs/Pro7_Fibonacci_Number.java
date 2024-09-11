package com.java.numberprograms;

//The Logic for Fibanacci number is  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,

public class Pro7_Fibonacci_Number {

	public static void main(String[] args) {

		int a = 0, b = 1;

		for (int i = 1; i <= 5; i++) {

//			System.out.println(a);

			int c = a + b;

			a = b;
			b = c;

			System.out.println(c);
		}
	}

}
