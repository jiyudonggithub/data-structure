package day0403;

public class Demo13 {

	public static void main(String[] args) {
		/*
		 * 打印1-100以内的所有质数。
		 */
		for (int i = 1; i <= 100; i++) {
			int a = 0;
			for (int j = 2; j < i; j++) {
				if (i % j != 0) {
					a++;
				}
			}
			if (a == i - 2) {
				System.out.println(i);
			}
		}
	}
}
