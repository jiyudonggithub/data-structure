package day0423.test;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("请输入字符串：");
		 String str1 = scanner.next();
		 shu(str1);

	}
	public static void shu(String str) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for (int i = 0; i < str.length(); i++) {
			 if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				num1++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				num2++;
			} else {
				num3++;
			}
		}
		System.out.println("小写字母的个数：" + num1 + " 大写字母的个数：" + num2 +" 其他的个数：" + num3);
	}
}
