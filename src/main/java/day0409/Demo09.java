package day0409;

import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入需要打印的质数范围2~");
		int max = scanner.nextInt();
		int a=0;
		for (int i = 2; i < max+1; i++) {
			if (juageZhiShu(i)) {
				System.out.print(i+" ");
				if (a%10==9) {
					System.out.println();
				}
				a++;
			}
		}
		System.out.println("共"+a+"个质数");
		 scanner.close();

	}

	public static boolean juageZhiShu(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}

		return true;

	}

}
