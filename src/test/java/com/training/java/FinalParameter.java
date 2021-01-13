package com.training.java;

public class FinalParameter {

	int cube(final int n){
		n=n+2;
		System.out.println(	n);
		return n;//can't be changed as n is final  

	}  
	public static void main(String args[]){  
		FinalParameter b=new FinalParameter();  
		b.cube(5);  
	}  

}
	