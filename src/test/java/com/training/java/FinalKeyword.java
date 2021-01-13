package com.training.java;

public class FinalKeyword {

	 final int limit=10;

	void run(){  
		limit=400;  
	}  
	public static void main(String args[]){  
		FinalKeyword obj=new  FinalKeyword();  
		obj.run();  
	}  
	
	public final void show() {
		System.out.println("final method");
	}
	
	

}
