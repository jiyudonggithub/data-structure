package day0425.entity;

import java.util.Scanner;

public class IsShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入:");
		Scanner scanner = new Scanner(System.in);
		String next = scanner.next();
		if (next.matches("\\d+(\\.)?\\d+")) {
			if (next.contains(".")) {
				System.out.println("这是个小数" + Double.parseDouble(next));
			} else {
				System.out.println("这是个整数" + Integer.parseInt(next));
			}

		} else {
			System.out.println("这不是个数");
		}

	}

}
