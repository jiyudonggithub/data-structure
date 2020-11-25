package day0409;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		System.out.println("请输入范围");
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		int fanWei = scanner.nextInt();
		System.out.println("输入的范围为2~"+fanWei);
		int b=0;
		for (int i = 2; i < fanWei; i++) {
			int a=0;
			for (int j = 2; j < i; j++) {
				if (i%j != 0) {
					a++;
				}
			}
			if(a==i-2){
				System.out.print(i+"\t");
				if (b%10==9) {
					System.out.println();
				}
				b++;
			}
			}
		System.out.println();
		System.out.println("共有"+b+"个质数");
				

	}

}
