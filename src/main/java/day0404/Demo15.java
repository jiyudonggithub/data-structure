package day0404;

public class Demo15 {

	public static void main(String[] args) {
		/*
		 * 	再控制台打印乘法口诀
		 * */
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "X" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
