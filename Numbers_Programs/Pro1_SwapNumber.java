package com.java.numberprograms;

public class Pro1_SwapNumber {

	public static void main(String[] args) {

		int a = 12;
		int b = 25;

		int temp;

		System.out.println("Before");

		System.out.println("a " + a);
		System.out.println("b: " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After");

		System.out.println("a " + a);
		System.out.println("b: " + b);

	}

}
