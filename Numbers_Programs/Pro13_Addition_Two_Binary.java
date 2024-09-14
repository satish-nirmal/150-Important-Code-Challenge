package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Add Two Binary Strings. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro13_Addition_Two_Binary {

	public static String AddBinery(String x, String y) {

		int num1 = Integer.parseInt(x, 2);

		int num2 = Integer.parseInt(y, 2);

		int sum = num1 + num2;

		String total = Integer.toBinaryString(sum);
		System.out.println("total of two binery : " + total);

		return total;
	}

	public static void main(String[] args) {

		String x = "011011", y = "1010111";
		AddBinery(x, y);

	}

}
