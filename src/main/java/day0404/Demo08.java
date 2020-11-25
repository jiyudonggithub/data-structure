package day0404;

public class Demo08 {

	public static void main(String[] args) {
		/*
		 * 打印出所有的 "水仙花数 "， 所谓 "水仙花数 "是指一个三位数， 其各位数字立方和等于该数本身
		 */
		for (int i = 100; i <= 999; i++) {
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;
			if (i == (int) (Math.pow(a, 3)) + (int) (Math.pow(b, 3)) + (int) (Math.pow(c, 3))) {
				System.out.println(i);
			}
		}
	}
}
