package day0409;

import java.util.Arrays;

public class Demo10 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			 temp = (int) (Math.random()*21);
			if (chongfu(arr,temp,i)) {
				arr[i]=temp;
			}else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arr) );
}
	
	public static boolean chongfu(int[] arr ,int temp,int a) {
		for (int i = 0; i < a; i++) {
			if (arr[i]==temp) {
				return false;	
			}
		}
		return true;
		
	}
}
