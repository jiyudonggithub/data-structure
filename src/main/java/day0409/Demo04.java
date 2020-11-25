package day0409;

import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 7, 2, 2, 3, 7, 1, 5, 0, 0, 6 };
		//1723506
		int[] brr = new int[arr.length];
		/*
		 * 把数组里面重复的元素剔除掉
		 * 
		 */
		int index = 0;
		brr[index++] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < index; j++) {
				if (arr[i] == brr[j]) {
					break;
				}
				if (j == index - 1) {
					brr[index++] = arr[i];
				}
			}
		}
		System.out.println(index);
		System.out.println(Arrays.toString(brr));
		int[] crr = new int[index];
		System.arraycopy(brr, 0, crr, 0, index);
		System.out.println(Arrays.toString(crr));

	}

}
