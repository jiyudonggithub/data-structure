package day0402;

import java.util.Scanner;

public class Demo03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入单价（￥）：");
		Scanner scanner = new Scanner(System.in);
			double peer = scanner.nextDouble();
		System.out.println("请输入数量：");
			double count = scanner.nextDouble();
		System.out.println("请输入金额（￥）：");	
			double money = scanner.nextDouble();
		System.out.println("应收金额为：￥"+(count*peer)+",找零为：￥"+(money-count*peer));
		
	}

}
