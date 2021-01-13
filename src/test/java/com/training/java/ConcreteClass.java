package com.training.java;

public class ConcreteClass implements InterfaceExample {
	
	int i, j;

	public void addNumbers(int i, int j) {		
		System.out.println(i+j);		
	}

	public void multiplyNumbers(int i, int j) {
		System.out.println(i*j);
	}

	public void dividNumbers(int i, int j) {
		System.out.println(i/j);
		
	}
	
	public static void showNumbers() {
		
	}
	
	static {
		System.out.println("Test");
	}
	
	public static void main(String[] args) {		
		ConcreteClass k = new ConcreteClass();
		k.addNumbers(10,20);
		k.multiplyNumbers(10,20);
		k.dividNumbers(20,10);
		ConcreteClass.showNumbers();
		
	}
	
	
	

}
