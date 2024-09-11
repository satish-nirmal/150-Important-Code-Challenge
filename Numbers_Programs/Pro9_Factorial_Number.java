package com.java.numberprograms;

//factorial logic are :- 1 * 2 * 3 * 4 * ... * num

public class Pro9_Factorial_Number {

	public static void main(String[] args) {

		int num = 5;
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println(fact);
	}

}
