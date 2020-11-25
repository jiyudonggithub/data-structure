package day0403;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		/*
		 * 输入月份，判断所属季节。
		 * */
		System.out.println("请输入月份：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "月是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "月是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "月是秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "月是冬季");
			break;

		default:
			System.out.println("输入不合法");
		}

	}

}
