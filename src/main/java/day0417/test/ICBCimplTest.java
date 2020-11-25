package day0417.test;

import java.util.Scanner;

import day0417.entity.ICBCimpl;

public class ICBCimplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICBCimpl icbc = new ICBCimpl(3000);
		System.out.println("请输入密码:");
		Scanner scanner = new Scanner(System.in);
		String pwd = scanner.next();
		if (icbc.checkPwd(pwd)) {
			System.out.println("请输入金额:");
			double money = scanner.nextDouble();
			icbc.drawMoeny(money);
			System.out.println("请输入支付金额:");
			 money = scanner.nextDouble();
			icbc.payOnLine(money);
		}else {
			System.out.println("请取回卡:");
		}
		scanner.close();

	}

}
