package com.training.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmaple {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> h = new HashMap<>();
		
		h.put(1,"Santosh");
		h.put(2, "abhi");
		h.put(3, "Pavan");
		h.put(null, null);
		h.put(null, "test");
		h.put(1,"Jaswanth");
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		for (Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey() +"-->"+m.getValue());
			
		}
		
		
		
		
	}

}
