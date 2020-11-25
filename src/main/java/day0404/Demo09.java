package day0404;

import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * ATM取款机
		 */
		System.out.println("请输入密码:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		// 密码错误标志，如果输入正确则为ture
		boolean flag = true;
		int pssword;
		for (int i = 0; i < 3; i++) {
			 pssword = scanner.nextInt();
			if (pssword == 111111) {
				flag = false;
				break;
			}
			if (i < 2) {
				System.out.println("请重新输入密码:");
			}
		}
		if (flag) {
			System.out.println("请取出卡，结束交易.");
		} else {
			System.out.println("请输入取款金额(最低取款金额为100￥):");
			int money = scanner.nextInt();
			//如果输入金额不对，从新输入
			while ((money / 100) > 10 || (money % 100) != 0) {
				System.out.println("请输入正确的取款金额(最低取款金额为100￥):");
				money = scanner.nextInt();
			}
			System.out.println("您现取款:" + money + "￥");
			System.out.println("结束交易.");
		}

	}
}
