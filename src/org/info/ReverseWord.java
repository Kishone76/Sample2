package org.info;

public class ReverseWord {

	public static void main(String []args) {
        
		
		String[] words = "welcome to java".split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		System.out.println(words);
		String reversestring = " ";
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String reverseword = " ";
			for (int j = word.length() - 1; j >= 0; j--) {

				reverseword = reverseword + word.charAt(j);

			}
			reversestring = reversestring + reverseword + " ";
		}

		
		System.out.println(reversestring);

	}

	
}
