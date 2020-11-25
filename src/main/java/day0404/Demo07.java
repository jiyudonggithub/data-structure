package day0404;


public class Demo07 {

	public static void main(String[] args) {
		int[] arrays = new int[] { 3, 4, 5, 6, 89, 45, 26, 1, 8, 96 };
		int min = arrays[6];
		int max = arrays[6];
		for (int i = 0; i < arrays.length; i++) {
			if (max < arrays[i]) {
				max = arrays[i];
			}
			if (min > arrays[i]) {
				min = arrays[i];
			}

		}
		System.out.println("数组中的最大值为：" + max + "\t数组中的最小值为：" + min);
	}

}
