package day0404;

public class Demo11 {

	public static void main(String[] args) {
		/*
		 * 定义一个数组来存储12个学生的成绩 {72,89,65,58,87,91,53,82,71,93,76,68}，
		 * 计算并输出学生的平均成绩。
		 * 
		 */
		int[] arrays = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68 };
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		System.out.println("学生的平均成绩:" + (sum / arrays.length));
	}
}
