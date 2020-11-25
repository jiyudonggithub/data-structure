package day0403;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] brr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		System.out.println("原数组：" + Arrays.toString(arr));
		System.arraycopy(arr, 0, brr, 0, brr.length );
		System.out.println("原数组：" + Arrays.toString(brr));
		Arrays.sort(arr);
		System.arraycopy(arr, 0, brr, 0, brr.length);
		System.out.println("排序后：" + Arrays.toString(arr));
		System.out.println("排序后：" + Arrays.toString(brr));
	}

}

/*
 * 数组按照从小到大的排列 arr 数组名
 */
class Arr {
	public static int[] ac(int[] arr) {
		for (int i = 0; i < arr.length - i; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}

			}
			Arrays.sort(arr);
			System.out.println("排序第：" + i + "次" + Arrays.toString(arr));
		}
		return arr;

	}

}
