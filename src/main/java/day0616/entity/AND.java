package day0616.entity;

import java.util.Arrays;
import java.util.Random;

public class AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[11];
		Random random = new Random();
		for (int i = 0; i < num.length - 1; i++) {
			num[i] = i;
		}
		int nums = random.nextInt(11);

		num[num.length - 1] = nums;
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		int x1 = 0;
		for (int i = 0; i < num.length - 1; i++) {
			x1 ^= i;
		}
		for (int i : num) {
			x1 ^= i;
		}
		System.out.println(x1);
	}

}
