package com.training.java;

public class OverLoadingExample {

	public int addNumbers(int i, int j, int k) {
		int result = i+j+k;
		System.out.println(result);
		return result;
	}
	
	public int caluclation(int i, int j) {
		int result = i+j;
		System.out.println(result);
		return result;
	}
	
	public int addNumbers(int i, int j, int k, int l, int ...m) {
		int result = i+j+k;
		System.out.println(result);  //overloading with optional parameters
		return result;
	}
	
	public static void main(String[] args) {
		OverLoadingExample oe = new OverLoadingExample();
		oe.caluclation(10, 20);
		oe.addNumbers(10, 20, 30);
		oe.addNumbers(10, 20, 30, 40);
		oe.addNumbers(10, 20, 30, 40, 50);
		
	}

}
