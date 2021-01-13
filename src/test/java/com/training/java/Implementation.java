package com.training.java;

public class Implementation {
	
	public static void main(String[] args) {
		
		InterfaceExample ie = new ConcreteClass();
		ie.addNumbers(10, 20);
		ConcreteClass2 ct2 = new ConcreteClass2();
		
		
		ie = new ConcreteClass2();		
		ie.addNumbers(10, 20);
		
	}

}
