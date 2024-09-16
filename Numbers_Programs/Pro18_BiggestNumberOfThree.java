package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Find the Largest of three Numbers. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro18_BiggestNumberOfThree {

	static int findBiggestNumber(int x, int y, int z) {

		if (x >= y && x >= z) {

			return x;
		}

		else if (y >= x && y >= z) {

			return y;
		}

		else {
			return z;
		}

	}

	public static void main(String[] args) {

		int x = 10, y = 40, z = 39;

		int biggestNumber = findBiggestNumber(x, y, z);

		System.out.println(biggestNumber);
	}

}
