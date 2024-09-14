package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Swap Two Numbers using method. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro14_Swapping_Using_Method {

	public static void swapValuesUsingThirdVariable(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Value of m is : " + a + " & Value of n is : " + b);
	}

	public static void main(String[] args) {

		int a = 11;
		int b = 9;

		swapValuesUsingThirdVariable(a, b);

	}

}
