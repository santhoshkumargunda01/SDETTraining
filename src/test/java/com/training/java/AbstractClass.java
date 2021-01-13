package com.training.java;

public class AbstractClass  extends Abstract{

	@Override
	public int num() {

		System.out.println("hi");

		return 0;

	}

	public static void main(String[] args) {
		AbstractClass ab = new AbstractClass();
		ab.num();
		ab.numbers(10, 5);







	}

}