package com.training.java;

public class ExceptionExample {

	int i=9;
	int j=0;
	int k;
	String e;


	public void exceptionMethod() {
		try{
			k=i/j;
			System.out.println(k);
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
		try {
			
			System.out.println(e.substring(0));
		}	
		
		catch(ArithmeticException e) {
			System.out.println("in second catch block");
			e.printStackTrace();
		}

		catch(NullPointerException e) {
			System.out.println("in second catch block");
			e.printStackTrace();
		}

		catch(Exception e) {
			System.out.println("in third catch block");
			e.printStackTrace();
		}


		finally {
			System.out.println("finally");
		}

	}

	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.exceptionMethod();
	}

}
