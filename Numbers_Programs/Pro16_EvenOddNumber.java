package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Check if a Given Integer is Odd or Even. - (GFG)
 */
/**
 * @author Satish
 */

import java.util.Scanner;

public class Pro16_EvenOddNumber {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int num = obj.nextInt();

		if (num % 2 == 0) {
			System.out.println("This is Even Number");
		} else {
			System.out.println("This is Odd Number");
		}

		obj.close();
	}

}
