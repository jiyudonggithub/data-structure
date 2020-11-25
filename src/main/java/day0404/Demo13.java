package day0404;

public class Demo13 {

	public static void main(String[] args) {
		/*
		 * 定义一个长度为10的int数组,
		 * 统计数组中的最大值、最小值、
		 * 以及奇数和偶数的个数
		 * */
		int[] arrays = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93 };
		int a = 0;
		int b = 0;
		int min = arrays[6];
		int max = arrays[6];
		for (int i = 0; i < arrays.length; i++) {
			if (max < arrays[i]) {
				max = arrays[i];
			}
			if (min > arrays[i]) {
				min = arrays[i];
			}
			if (arrays[i] % 2 == 0) {
				a++;
			} else {
				b++;
			}
		}
		System.out.println("数组中的最大值为：" + max + "\t数组中的最小值为：" + min);
		System.out.println("数组中的奇数为个数：" + b + "\t数组中的偶数为个数为：" + a);
	}
}
