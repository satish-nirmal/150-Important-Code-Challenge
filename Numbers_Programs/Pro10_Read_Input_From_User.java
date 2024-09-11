package com.java.numberprograms;

import java.util.Scanner;

/**
 * Question :
 * 1. Java Program to Read The Number From Standard Input. - (GFG)
 */
/**
 * @author Satish 
 */

public class Pro10_Read_Input_From_User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println("Read and Print an Integer value is  :" + number);

		sc.close();
	}

}
