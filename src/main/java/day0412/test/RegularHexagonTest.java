package day0412.test;

import java.util.Scanner;

import day0412.entity.RegularHexagon;

public class RegularHexagonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入正六边形的边长:");
		int a = scanner.nextInt();
		RegularHexagon regularHexagon = new RegularHexagon(a);
		System.out.println(regularHexagon.getAcreage());
		scanner.close();

	}

}
