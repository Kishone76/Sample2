package org.info;

public class MainMethodOverLoad {

	
	public static void main(String s) {
		System.out.println(s);
	}

	public static void main(int i) {
		System.out.println(i);
	}

	public static void main(long l) {
		System.out.println(l);
	}

	public static void main(float f) {
		System.out.println(f);
	}
	public static void main(String ...s) {
		main("Raj");
		main(1805);
		main(8122483438l);
		main(876.876f);
		System.out.println("method 2");
		System.out.println("2");
		
	}
}
