package day0408;

import java.util.Arrays;

public class Demo06 {

	public static void main(String[] args) {
		int[] score={1,2,3,4,5,6,7,8,9,10};
		Bubbling(score);
		System.out.println(Arrays.toString(score));
 
	}
	
	public static void  Bubbling(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j]>array[j+1]) {
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];	
				}
			}	
		}
		
	}

}
