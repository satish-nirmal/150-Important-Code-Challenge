package com.java.numberprograms;

import java.util.Scanner;

public class Pro4_SumOfDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;

		}
		System.out.println(sum);
		s.close();
	}

}
