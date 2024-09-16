package com.java.numberprograms;

import java.util.Scanner;

/**
 * Question :
 * 1. Java Program to Find if a Given Year is a Leap Year. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro17_LeapYear {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int year = obj.nextInt();

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

			System.out.println("This is leap year");
		} else {
			System.err.println("This is not leap year");
		}
		obj.close();
	}

}
