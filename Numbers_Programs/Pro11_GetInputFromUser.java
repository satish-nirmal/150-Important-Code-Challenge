package com.java.numberprograms;

import java.util.Scanner;

/**
 * Question :
 * 1. Java Program to Get Input from the User for using all data-type. - (GFG)
 */
/**
 * @author Satish 
 */

public class Pro11_GetInputFromUser {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		String name = obj.nextLine();
		System.out.println("Input Name is  : " + name);

		int intNumber = obj.nextInt();
		System.out.println("Input Integer Number is : " + intNumber);

		float floatNumber = obj.nextFloat();
		System.out.println("Input Float Number is  : " + floatNumber);
		obj.close();
	}

}
