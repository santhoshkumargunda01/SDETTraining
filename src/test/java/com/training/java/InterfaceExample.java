package com.training.java;

public interface InterfaceExample {
	
	public void addNumbers(int i, int j);
	
	public void multiplyNumbers(int i, int j);
	
	public void dividNumbers(int i, int j);
	
	public default void substract(int i, int j) {
		
	}	

}
