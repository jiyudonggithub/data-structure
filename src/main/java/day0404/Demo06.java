package day0404;

public class Demo06 {

	public static void main(String[] args) {

		int sum = 1;
		for (int i = 1; i <= 5; i++) {

			sum *= i;
		}
		System.out.println("5的阶乘为：" + sum);
	}

}
