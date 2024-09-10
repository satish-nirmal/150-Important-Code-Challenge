package com.java.numberprograms;

public class Pro5_Resvers_Number {

	public static void main(String[] args) {

		int num = 123;

		int rev = 0, rem = 0;

		while (num > 0) {

			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println("the reverse number is : " + rev);
	}
}
