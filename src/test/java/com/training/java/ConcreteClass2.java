package com.training.java;

public class ConcreteClass2 implements InterfaceExample{	
	

	public void addNumbers(int i, int j) {
		
	  System.out.println(i*2+j*3);	
		
	}

	public void multiplyNumbers(int i, int j) {
		 System.out.println(i*2*j*3);	
	}

	public void dividNumbers(int i, int j) {
		 System.out.println(i*2/j*3);	
		
	}
	
	
	public static void main(String[] args) {
		ConcreteClass2 ce2 = new ConcreteClass2();
		ce2.addNumbers(10, 20);
		ce2.multiplyNumbers(10, 20);
		ce2.dividNumbers(30, 10);
		
	}
	

}
