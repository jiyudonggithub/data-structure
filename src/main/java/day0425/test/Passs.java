package day0425.test;

import java.util.Scanner;

import day0425.entity.RegExUtil;

public class Passs {

	public static void main(String[] args) {
		RegExUtil rUtil = new RegExUtil();
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String next = scanner.next();
		while (!(rUtil.isCard(next)||rUtil.isEmial(next)||rUtil.isIDCard(next))) {
			next = scanner.next();
		}
		System.out.println("请输入密码:");
		String pass = scanner.next();
		for (int i = 0; i < 3; i++) {
			if (pass.matches("\\w{6,18}")) {
				System.out.println("密码输入正确");
				return;
			}
		}
		System.out.println("超过次数");
	}
}
