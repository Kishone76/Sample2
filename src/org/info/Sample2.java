package org.info;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample2 extends Sample1{
   
	public static void main(String[] args) {
//		for (int i = 0; i < 6; i++) {
//			for (int j = 6-1; j >i ; j--) {
//				System.out.print(" ");
//			}
//			for (int j2 = 0; j2<i; j2++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		
//		}
	
	List list = new ArrayList();
	list.add("shaik");
	list.add("dawood");
	list.add("radhan");

	for (int i = 0; i < args.length; i++) {
		String string = args[i];
		System.out.println(string);
	}
	
	
	
	}
	
}