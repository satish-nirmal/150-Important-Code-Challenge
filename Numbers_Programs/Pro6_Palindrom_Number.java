package com.java.numberprograms;

public class Pro6_Palindrom_Number {

	public static void main(String[] args) {

		int num = 898;

		int rem, rev = 0;
		
		int temp = num;

		while (temp > 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (num == rev) {
			System.out.println("palindrom");
		} else {
			System.err.println("not palindrom");
		}
	}
}
