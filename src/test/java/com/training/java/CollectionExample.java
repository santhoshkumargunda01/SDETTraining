package com.training.java;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		String[] arry = {"test","blog"};
		
		List<String> listExmaple = new ArrayList();
		listExmaple.add("test");
		listExmaple.add("blog");
		for (String str : listExmaple) {
			
			System.out.println(str);
			//System.out.println(listExmaple.get(1));
			
			
		}
		
		
		
	}

}
