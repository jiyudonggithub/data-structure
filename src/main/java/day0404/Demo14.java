package day0404;

public class Demo14 {

	public static void main(String[] args) {
		/*
		 * 将指定数组中的数组元素进行反转
		 */
		int[] arrays = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93 };
		for (int i = 0; i < arrays.length / 2; i++) {
			arrays[i] = arrays[i] + arrays[arrays.length - i - 1];
			arrays[arrays.length - i - 1] = arrays[i] - arrays[arrays.length - i - 1];
			arrays[i] = arrays[i] - arrays[arrays.length - i - 1];
		}
		for (int i = 0; i < arrays.length; i++) {

			System.out.print(arrays[i] + ",");
		}

	}
}
