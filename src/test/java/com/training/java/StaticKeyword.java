package com.training.java;

public class StaticKeyword {
	
	int i=0;
	int j=10;
	static int k=10; //single copy of variable
	
	
	public StaticKeyword() {		
		this.i=30;
		System.out.println("in constructor"+i);		
	}
	
	static {
		System.out.println("In static block");
	}
	
	public static void testStaticMethod() {
		System.out.println("In static methods");
	}
	
	public void normalMethod() {
		System.out.println("normal method");
	}
	
	public static void main(String[] args) {
		StaticKeyword.testStaticMethod();
		StaticKeyword sk = new StaticKeyword();
		StaticKeyword sk2 = new StaticKeyword();		
		sk.normalMethod();
		System.out.println(sk.k);
		System.out.println(sk2.k);
		
		
	}

}
