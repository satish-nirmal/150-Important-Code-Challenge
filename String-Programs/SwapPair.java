package com.java.code.string;

public class SwapPair {

	public static String swapPair(String str) {

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i += 2) {

			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}

		return new String(ch);
	}

	public static void main(String[] args) {

		String str = "satish";

		System.out.println(swapPair(str));
	}

}
