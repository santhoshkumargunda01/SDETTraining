package com.training.programs;

public class ArrayMaxMin {


	public int maximum(int []array) {
		int max = 0;

		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];

			}
		}
		return max;



	}

	public int manimum(int []array) {
		int min = array[0];

		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];

			}
		}
		return min;

	}
	
	public static void main(String[] args) {
		int[] array = {23, 92, 56, 39, 93};
		ArrayMaxMin m = new ArrayMaxMin();
	      System.out.println("Maximum value in the array is::"+m.maximum(array));
	      System.out.println("Minimum value in the array is::"+m.manimum(array));
	}
	
}
