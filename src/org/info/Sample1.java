package org.info;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Sample1 {

	public static void main(String[] args) {

		int a[] = new int [3];

		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array\n"+a[i]);
		}


		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			System.out.println("List\n"+list.get(i));
		}
		Set<Integer> set = new  LinkedHashSet();
		set.add(100);
		set.add(200);
		set.add(300);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			for (Integer integer : set) {
				map.put(list.get(i), integer);
			}
		}
		System.out.println(map);
		
		
		
		




	}
}
