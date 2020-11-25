package day0408;

import java.util.Arrays;

public class Demo09 {

	public static void main(String[] args) {
		int[] arrays = { 7, 8, 9, 1, 3, 16, 5, 15 };
		Demo06.Bubbling(arrays);
		System.out.println(Arrays.toString(arrays));
		int hight = arrays.length - 1;
		int low = 0;
		int middle = (hight + low) / 2;
		while (low <= hight) {
			if (arrays[middle] > 8) {
				hight = middle-1;
				middle = (hight + low) / 2;
			}else if (arrays[middle] < 8) {
				low = middle+1;
				middle = (hight + low) / 2;
			}else {
				System.out.println(middle);
				break;
			}
		}
		if (low > hight) {
			System.out.println("该数组中没有吧");
		}
		

	}
}
