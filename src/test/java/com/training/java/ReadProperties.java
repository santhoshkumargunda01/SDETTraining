package com.training.java;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class ReadProperties {
	
	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\test.properties");			
			
			System.out.println("file path"+System.getProperty("user.dir")+"\\src\\test\\java\\test.properties");			
			
			Properties p = new Properties();
			p.setProperty("url", "Amazon.com");
			p.store(new FileWriter(System.getProperty("user.dir")+"\\src\\test\\java\\test.properties"), "write something");
			
			p.load(reader);
		
			
			System.out.println(p.getProperty("browser"));
			System.out.println(p.getProperty("env"));
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
