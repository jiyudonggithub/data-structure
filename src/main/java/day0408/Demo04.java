package day0408;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("原始数组:" + Arrays.toString(num));
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] < num[j + 1]) {
					num[j] = num[j] + num[j + 1];
					num[j + 1] = num[j] - num[j + 1];
					num[j] = num[j] - num[j + 1];
				}
			}
			System.out.println("第" + (i + 1) + "次排列" + Arrays.toString(num));
		}
		System.out.println("排序数组:" + Arrays.toString(num));

	}

}
