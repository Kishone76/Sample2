package org.info;

public class Pallindrome {

	public static void main(String[] args) {
		String s = "peep";
		String reverse = "";
		for (int i = s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
		
			reverse = reverse+c;
		}
		if (s.equals(reverse)) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		}
	}
}
