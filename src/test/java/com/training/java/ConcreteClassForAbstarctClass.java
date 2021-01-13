package com.training.java;

public class ConcreteClassForAbstarctClass extends AbstarctClass {

	@Override
	public void multiplyNumbers() {
		
		System.out.println("designed for multiplication");
		
		
	}
	
	public static void main(String[] args) {
		ConcreteClassForAbstarctClass ac = new ConcreteClassForAbstarctClass();		
		ac.addNumbers(10, 20);
		ac.multiplyNumbers();
	}
	
	

}
