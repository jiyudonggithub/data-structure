package day0423.test;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
//		 Scanner scanner = new Scanner(System.in);
//		 System.out.println("请输入字符串：");
//		 String str1 = scanner.next();
//		 System.out.println("请输入子串：");
//		 String str2 = scanner.next();
		String str1 = "abcbcbabcb34bcbd";
		String str2 = "bcb";
//		int star = str1.indexOf(str2, 0);
		int i = 0;
		int star = 0;
		int last = str1.lastIndexOf(str2);
//		System.out.println(star);
//		System.out.println(last);
		while (star < last) {
			if (i == 0) {
				star = str1.indexOf(str2, star);
			}else {
				star = str1.indexOf(str2, star+ str2.length());
			}
			i++;
			System.out.println(star);

		}
	}

}
