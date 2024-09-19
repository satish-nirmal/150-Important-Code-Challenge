package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to check below number Prime Numbers or not - (GFG)
 */
/**
 * @author Satish
 */

public class Pro19_Simple_PrimeNumber {

	public static void main(String[] args) {

		int num = 4;
		int flag = 0;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("This is Prime number ");
		} else {
			System.out.println("Not Prime Number");
		}
	}
}
