package day0408;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		int[] scores = { 90, 85, 100, 45, 22, 60 };
		int[] scores2 = new int[10];
		System.arraycopy(scores, 1, scores2, scores2.length - scores.length + 1, scores.length - 1);
		System.out.println(Arrays.toString(scores2));
		int[] arrays = Arrays.copyOf(scores, 9);
		System.out.println(Arrays.toString(arrays));
	}

}
