package com.training.java;



public class StringProgram {	
	
	
	public static void main(String[] args) {
		String s = "Hello test world test";
		String s1 = "HELL O world test ";
		String s2 = null;
		System.out.println(s.length());
		System.out.println(s.charAt(12));
		System.out.println(s.substring(12));
		System.out.println(s.substring(6, 12));
		if(s.contains(s1)) {
			System.out.println("Contained substring");
		}
		
		System.out.println(s1.isEmpty());		
		System.out.println(s1.concat(s));
		System.out.println(s.replace("l", "h"));
		System.out.println("testtt"+s.replace("test", "world"));
		System.out.println(s.replace("test", "java"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.split(" "));
		
		
		
		String[] splitOutput = s.split(" ");
		for(int i =0;i<splitOutput.length;i++) {
			System.out.println(splitOutput[i]);
		}
		
		
		System.out.println(s.indexOf('w'));
		System.out.println(s.indexOf("test"));
		System.out.println(s.indexOf("test", 0));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1);
		System.out.println(s1.valueOf(2));	
		
		
		  	
		
	}

}
