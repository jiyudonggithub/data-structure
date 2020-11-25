package day0408;

import java.util.Arrays;

public class Demo10 {

	public static void main(String[] args) {
		int[] arrays={7,8,9,1,3};
		reverSeorder(arrays);
		System.out.println(Arrays.toString(arrays));
		
		

	}
	public static void  reverSeorder(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j]<array[j+1]) {
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];	
				}
			}	
		}
		
	}
}
