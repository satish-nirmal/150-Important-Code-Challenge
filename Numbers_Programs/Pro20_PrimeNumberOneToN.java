package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Display All Prime Numbers from 1 to N - (GFG)
 */
/**
 * @author Satish
 */

public class Pro20_PrimeNumberOneToN {

	public static void main(String[] args) {

		int num = 10;

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {

					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

}
