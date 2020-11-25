package day0409;

import java.util.Arrays;

public class Demo07 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] result = new int[11];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)( Math.random()*100);
		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min>array[i]) {
				min=array[i];	
			}
		}
		System.arraycopy(array, 0, result, 1, array.length);
		result[0]=min;
		System.out.println("数组中的元素"+Arrays.toString(array));
		System.out.println("最小值为"+min);
		System.out.println("新数组中的元素"+Arrays.toString(result));

	}

}
