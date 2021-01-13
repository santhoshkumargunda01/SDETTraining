package com.training.java;

public class ExceptionOverriding {
	
	public void msg() {
		System.out.println("Terst");		
	}
	
	public static void main(String[] args) {
		ExceptionOverriding er = new ExceptionOverriding();
		ExceptionChild ech = new ExceptionChild();
		ech.msg();
	}

}
