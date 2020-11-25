package day0403;

import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		System.out.println("请输入数：");
		@SuppressWarnings({ "resource" })
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("请输入数：");
		int num2 = scanner.nextInt();
		int max, min;
		max = num1 > num2 ? num1 : num2;
		min = num1 < num2 ? num1 : num2;
		int b = (max - min) / 2;
		int a = 0;
		while (a < b) {
			if (min % 2 == 0) {
				System.out.println(min + 2);
				min = min + 2;
			} else {
				System.out.println(min + 1);
				min = min + 1;
			}
			a++;
		}
	
			
	}

}
