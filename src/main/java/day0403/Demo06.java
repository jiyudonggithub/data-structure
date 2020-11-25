package day0403;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		System.out.println("请输入年份：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		boolean bb = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		boolean aa = bb ? true : false;
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		/*
		 * 如果case语句没写break关键字
		 * 代码会从case一直往下执行，知道遇到break
		 * */
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year + "年" + month + "月是31天");
			break;
		case 2:
			if (aa) {
				System.out.println(year + "年" + month + "月是29天");

			} else
				System.out.println(year + "年" + month + "月是28天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year + "年" + month + "月是30天");
			break;
		default:
			System.out.println("输入不合法");
		}

	}

}
