package com.training.java;

public class StaticVariable{  
	  int count=0;//will get memory each time when the instance is created 
	

	StaticVariable(){  
		count++;//incrementing value  
		System.out.println(count);  
	}  

	public static void main(String args[]){  
		//Creating objects  
		StaticVariable c1=new StaticVariable();  
		StaticVariable c2=new StaticVariable();  
		StaticVariable c3=new StaticVariable();  
	}  
}  