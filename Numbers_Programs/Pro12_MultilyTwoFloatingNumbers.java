package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Multiply Two Floating-Point Numbers. - (GFG)
 */
/**
 * @author Satish 
 */

import java.util.Scanner;

public class Pro12_MultilyTwoFloatingNumbers {

	public static float MultiplyNumbers(float num1, float num2) {

		float total = num1 * num2;

		System.out.println("the multiplcation of two number is : " + total);

		return total;
	}

	public static void main(String[] args) {
//		MultiplyNumbers(5, 5);

//	Using Scanner Class

		Scanner obj = new Scanner(System.in);

		float num1 = obj.nextFloat();
		float num2 = obj.nextFloat();

		float total = num1 * num2;

		System.out.println("The Total of the numbers : " + total);
		obj.close();
	}
}
