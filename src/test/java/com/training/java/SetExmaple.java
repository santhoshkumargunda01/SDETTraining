package com.training.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExmaple {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("test");
		s.add("java");	
		
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
 		
	}
	

}
