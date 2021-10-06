package org.info;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SampleMethod extends Encapsulation {

	public static void main(String[] args) {

		SampleMethod sm = new SampleMethod();
		sm.setS("kishone");
		sm.setI(1806);
	    sm.setL(8122483438l);
	    sm.setC('a');
	
	     SampleMethod sm1 = new SampleMethod();
	     sm1.setS("Raj");
	     sm1.setC('b');
	     sm1.setI(1805);
	     sm1.setL(87654321l);
	     
	     
	     
//	     List<Encapsulation> li = new ArrayList<Encapsulation>();
//	     li.add(sm);
//	     li.add(sm1);
//	     
//	     for (int i = 0; i < li.size(); i++) {
//			System.out.println("Employee Name:"+li.get(i).getS());
//			System.out.println("Employee Name:"+li.get(i).getI());
//			System.out.println("Employee Name:"+li.get(i).getL());
//			System.out.println("Employee Name:"+li.get(i).getC());
			
			
	     Set<Encapsulation> s = new LinkedHashSet<Encapsulation>();
			
			s.add(sm);
			s.add(sm1);
			
			for (Encapsulation e : s) {
				
				System.out.println("Employee Name :"+e.getS());
				System.out.println("Employee Id :"+e.getI());
				System.out.println("Employee Number :"+e.getL());
				System.out.println("Employee character"+e.getC());
			}
			
			
		}
	
	}


