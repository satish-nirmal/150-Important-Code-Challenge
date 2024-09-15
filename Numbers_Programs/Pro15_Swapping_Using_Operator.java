package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Swap Two Numbers using Operator. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro15_Swapping_Using_Operator {

	public static void swappUsingBitwiseOpeartor(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("Value of a is : " + a + " & Value of b is : " + b);

	}

	public static void main(String[] args) {

		int a = 10, b = 20;

		swappUsingBitwiseOpeartor(a, b);
	}

}
