package day0404;

import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		int[] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = 10 - i;
		}
		System.out.println("原始数组:" + Arrays.toString(score));
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] > score[j + 1]) {
					score[j] = score[j] + score[j + 1];
					score[j + 1] = score[j] - score[j + 1];
					score[j] = score[j] - score[j + 1];
				}
			}
			System.out.println("第" + (i + 1) + "次排列" + Arrays.toString(score));
		}
		System.out.println("排序数组:" + Arrays.toString(score));
	}

}
