package com.training.java;

public class ThisKeyword extends ThisKeywordBase{

	int rollno;  
	String name;  //instance variable
	float fee;
	
	
	ThisKeyword(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
		this.display();
	}  
	
	@Override
	void display(){
		System.out.println(rollno+" "+name+" "+fee);}   


	public static void main(String args[]){  
		ThisKeyword s1=new ThisKeyword(111,"ankit",5000f);  
		ThisKeyword s2=new ThisKeyword(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		
	}}

