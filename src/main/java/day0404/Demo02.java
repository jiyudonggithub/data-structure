package day0404;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * int sum = 0; for (int i = 1; i <= 100; i++) { sum += i; }
		 * System.out.println(sum);
		 */
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int a = scanner.nextInt();
		System.out.println("请输入再一个数:");
		int b = scanner.nextInt();
		int max = a > b ? a : b;
		int min = a + b - max;
		int sum = 0;
		for (int i = min; i < max; i++) {
			if (i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("sum=" + sum);

	}

}
