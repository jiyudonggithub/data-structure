package day0403;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * 键盘输入一个三位数判断是否为水仙花数，如果是控制台打印是，
		 * 如果不是控制台打印不是
		    （每位数字的立方和等于该数即水仙花数）
		 * 
		 * */
		System.out.println("请输入数：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a / 100;
		int c = a / 10 % 10;
		int d = a % 10;
		if (a == ((int) Math.pow(b, 3) + (int) Math.pow(c, 3) + (int) Math.pow(d, 3))) {
			System.out.println("该数是水仙花数");
		} else {
			System.out.println("该数不是水仙花数");
		}

	}

}
