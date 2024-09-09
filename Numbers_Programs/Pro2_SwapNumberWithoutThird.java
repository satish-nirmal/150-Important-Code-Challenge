package com.java.numberprograms;

public class Pro2_SwapNumberWithoutThird {

	public static void main(String[] args) {

		int a = 20;
		int b = 11;

		System.out.println("Before");

		System.out.println("a " + a);
		System.out.println("b: " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After");

		System.out.println("a " + a);
		System.out.println("b: " + b);

	}

}
