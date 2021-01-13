package com.training.java;

public class ExceptionChild extends ExceptionOverriding {	
  
		@Override
		public void msg() {  
			System.out.println("TestExceptionChild");  
			throw new ArithmeticException("not valid");
		}  
		
		
		public static void main(String args[]){  
			ExceptionOverriding p=new ExceptionChild();  
			ExceptionOverriding pr = new ExceptionOverriding();			
			p.msg();  
			pr.msg();
		}  

}
