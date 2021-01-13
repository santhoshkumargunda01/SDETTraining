package com.training.java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOReadAndWrite {
	
	public static void main(String[] args) throws IOException {
		
		FileReader in = null;
		FileWriter out = null;
		int c = 0;
		
		try {
			
			in = new FileReader("D:\\Training\\AutomationPractice\\src\\test\\java\\test.txt");
			out = new FileWriter("D:\\Training\\AutomationPractice\\src\\test\\java\\testoutput.txt");
			
			while((c = in.read())!=1){
				out.write(c);
			}
			
		}
		finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
		}
		
		
		
		
	}

}
