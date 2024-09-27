package com.java.numberprograms;

public class Pro23_CountDigit {

	public static int countDigit(long num) {

		String x = Long.toString(num);

		int length = x.length();

		System.out.println(length);

		return length;
	}

	public static void main(String[] args) {

		long num = 12343456;

		countDigit(num);
	}

}
