package day0403;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		/*
		 * 从键盘接收三个整数，判断这三个数能否构成三角形，
		 * 如果能构建三角形，提示是直角三角形还是等边三角形等腰三角形还是普通三角形；
		 * 最后输出三角形周长；
		 * 
		 * */
		System.out.println("请输入数：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("请输入数：");
		int b = scanner.nextInt();
		System.out.println("请输入数：");
		int c = scanner.nextInt();
		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		int min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
		int mid = a + b + c - max - min;
		boolean tri1 =  min + mid > max;
		if (tri1) {
			System.out.println("可以构成三角形");
			if (min * min + mid * mid == max * max) {
				System.out.println("且为直角三角形");
			} else if (a == b || b == c || a == c) {
				System.out.println("且为等腰三角形");
			} else if (a == b && b == c) {
				System.out.println("且为等边三角形");
			} else
				System.out.println("且为普通三角形");
			System.out.println("周长为:" + (a + b + c));
		} else
			System.out.println("不可以构成三角形");

	}

}
