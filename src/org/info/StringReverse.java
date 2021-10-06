package org.info;

public class StringReverse {

	public static void main(String[] args) {

		String s = "kishone";
		int length = s.length();

		String output = "";
		for (int i = length - 1; i >= 0; i--) {
			char c = s.charAt(i);
			output = output + c;

		}
		System.out.println(output);
	}
}