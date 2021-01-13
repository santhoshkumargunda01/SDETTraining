package com.training.java;

public class ThrowsKeyWord {

	int i=9;
	int j=0;
	int k;	


	public void tryBlock() throws Exception {		
		k=i/j;
		System.out.println(k);	
	}

	public static void main(String[] args) {
		ThrowsKeyWord tk = new ThrowsKeyWord();
		try {
			tk.tryBlock();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
