package com.training.java;

public class HelloWorld {
	
	int i=10;
	double d =10.09;
	float f =10.8F;
	String s = "San";
	char c = 'a';
	byte b =10;	
	
	public static void main(String[] args) {
		System.out.println("First Program");
		HelloWorld h = new HelloWorld();
		h.addTwoNumbers();		
	}
	
	public void addTwoNumbers() {
		System.out.println(i+d);
		
	}
	

}
