package day0409;

import java.util.Arrays;
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入数组长度");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int length =scanner.nextInt();
		System.out.println("请输入数组元素的范围");
		int fanWei =scanner.nextInt();
		int[] arrays = generateArray(length,fanWei);
		System.out.println(Arrays.toString(arrays));
	}
	public static int[] generateArray(int length,int fanWei) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i]=(int)(Math.random()*fanWei);	
		}
		return array;
	}
}
