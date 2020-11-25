package day0417.test;

import java.util.Scanner;

import day0417.entity.ABCimpl;

public class ABCimplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCimpl abc = new ABCimpl(3000);
		System.out.println("请输入密码:");
		Scanner scanner = new Scanner(System.in);
		String pwd = scanner.next();
		if (abc.checkPwd(pwd)) {
			System.out.println("请输入金额:");
			double money = scanner.nextDouble();
			abc.drawMoeny(money);
			System.out.println("请输入支付金额:");
			 money = scanner.nextDouble();
			abc.payTelBill("15155727229", money);
		}else {
			System.out.println("请取回卡:");
		}
		scanner.close();
	}

}
