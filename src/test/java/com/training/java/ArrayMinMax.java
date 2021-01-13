package com.training.java;


public class ArrayMinMax {
	
	int max, min;
	
	
	public int getMaximumNumber(int[] array) {
		max = array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];				
			}		
		}			
		
		return max;
		
	}
	
	public int getMiniNumber(int[] array) {
		min = array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]<min) {
				min=array[i];				
			}		
		}			
		
		return min;
		
	}
	
	public static void main(String[] args) {
		ArrayMinMax ar = new ArrayMinMax();
		int[] array = {10, 1, 30, 40 , 70};
		System.out.println(ar.getMaximumNumber(array));
		System.out.println(ar.getMiniNumber(array));
	}
	
	
	

}
