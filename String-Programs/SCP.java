package com.java.code.string;

public class SCP {

	public static void main(String[] args) {
		String s1 = new String("Pune"); // two object is created one s1 in heap and another Pune in SCP.
		String s2 = "Pune"; // no object is created.
		String s3 = new String("Mumbai"); // two object is created that is s3 in heap and Mumbai in SCP.
		String s4 = new String("Pune"); // only one object is created this is s4 in heap.
		String s5 = "Mumbai"; // no object is created s5 is pointed to the SCP Mumbai.

		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5); // this is only for print the values.
	}
}
