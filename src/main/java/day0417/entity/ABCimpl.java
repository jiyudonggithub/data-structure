package day0417.entity;

import java.util.Scanner;

import day0417.interfaces.ABC;
import day0417.interfaces.UnionPay;
@SuppressWarnings ("all")
public class ABCimpl implements ABC {
	/**
	 * 总额
	 */
	private int total;

	public ABCimpl(int total) {
		super();
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	public boolean checkPwd(String pwd) {
		Scanner scanner = new Scanner(System.in);
		// 密码错误标志，如果输入正确则为ture
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			if (pwd.equals("111111")) {
				flag = true;
				break;
			}
			if (i < 2) {
				System.out.println("请重新输入密码:");
				pwd = scanner.next();
			} else if (!flag) {
				System.out.println("请重新输入密码:");
			}
		}

		return flag;
	}

	
	public void drawMoeny(double money) {
		Scanner scanner = new Scanner(System.in);
		// 如果输入金额不对，从新输入
		while ( (money % 100) != 0 || total - money < -2000.0) {
			System.out.println("请输入正确的取款金额:");
			money = scanner.nextDouble();
		}
		total -= money;
		System.out.println("取款成功，卡余额为:" + total);
	}

	
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.total;
	}

	/**
	 * 支付电话费
	 * 
	 * @param tel
	 * @param money
	 */
	public void payTelBill(String tel, double money) {

		Scanner scanner = new Scanner(System.in);
		// 如果输入金额不对，从新输入
		while ( (money % 100) != 0 || total - money < -2000.0) {
			System.out.println("请输入正确的取款金额:");
			money = scanner.nextDouble();
		}
		total -= money;
		System.out.println(tel+"号，充值成功，充值:" + total);

	}

}
