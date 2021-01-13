package com.training.java;

public class OverRidingExample extends OverLoadingExample{
	
	@Override
	public int caluclation(int i, int j) {
		int result = i-j;
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		OverRidingExample or = new OverRidingExample();
		OverLoadingExample ol = new OverLoadingExample();		
		
		OverLoadingExample orl = new OverRidingExample(); //dynamic binding
		
		or.caluclation(30, 20);
		ol.caluclation(30, 20);
		orl.caluclation(30, 10);
		
	}

}
