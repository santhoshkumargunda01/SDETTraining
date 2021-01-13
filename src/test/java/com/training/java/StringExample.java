package com.training.java;

public class StringExample {
	
	public static String s= "hello World";	
	public static String s1 = new String("hello  world");
	
	public static void main(String[] args) {
		StringExample se = new StringExample();
		char[] array = s.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}	
		
		
	}

}
