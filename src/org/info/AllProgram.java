package org.info;

public class AllProgram {
	
	public static void reverseString(String s) {
		String reverse="";
		for (int i = s.length()-1; i>=0; i--) {
			char charAt = s.charAt(i);
			reverse=reverse+charAt;
			
		}
				
		System.out.println(reverse);		
				
}
	public static void main(String[] args) {
	 reverseString("rathanson");
	 reverseString("navin");
		
		
		System.out.println("method1"
				+ "method 2");
		
	}
	

}
