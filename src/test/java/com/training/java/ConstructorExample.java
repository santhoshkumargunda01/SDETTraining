package com.training.java;

public class ConstructorExample {

	int num;
	int x;  //Instance variables 
	int y;
	String s;
	static int h=20;	

	ConstructorExample() {
		num = 100;
		s= "Java";
		System.out.println(s);
		
	}
	

	ConstructorExample(int x, int y){
		this.x=x;
		this.y=y;
		System.out.println(x+"----->"+y);
		System.out.println("Testt");

	}
	
	public void addNumbers() {
		System.out.println(x+y);
	}

	

	public static void main(String[] args) {
		
		System.out.println(h);
		//ConstructorExample ce = new ConstructorExample();
		ConstructorExample cep = new ConstructorExample(10,20);
		//System.out.println(ce.num);
		cep.addNumbers();
		
		
		


	}

}
