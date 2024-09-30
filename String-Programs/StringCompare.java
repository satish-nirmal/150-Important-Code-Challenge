package com.java.code.string;

public class StringCompare {

	public static void main(String[] args) {

		String s1 = new String("Pune");
		String s2 = new String("Pune");

		System.out.println(s1 == s2); // false because of the == operator only compare address of object not content.

		System.err.println(s1.equals(s2)); // true because String provides equal() for compare the content.
	}

}
