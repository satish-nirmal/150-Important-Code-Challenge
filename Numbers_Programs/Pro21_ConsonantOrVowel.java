package com.java.numberprograms;

/**
 * Question :
 * 1. Java Program to Check Whether the Character is Vowel or Consonant. - (GFG)
 */
/**
 * @author Satish
 */

public class Pro21_ConsonantOrVowel {

	static char vowel_Or_Consonant(char c) {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

			System.out.println("This is Vowel");
		}

		else {
			System.out.println("THis is Component");
		}
		return ' ';
	}

	public static void main(String[] args) {

		vowel_Or_Consonant('s');
	}

}
