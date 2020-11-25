package day0404;

public class Demo12 {

	public static void main(String[] args) {
		/*
		 * B哥去参加青年歌手大奖赛, 有10个评委打分,(去掉一个最高一个最低)求平均分
		 */
		int[] arrays = { 72, 89, 65, 58, 87, 91, 53, 82, 71, 93 };
		int sum = 0;
		int min = arrays[6];
		int max = arrays[6];
		for (int i = 0; i < arrays.length; i++) {
			if (max < arrays[i]) {
				max = arrays[i];
			}
			if (min > arrays[i]) {
				min = arrays[i];
			}
			sum += arrays[i];
		}
		sum = sum - max - min;
		System.out.println("B哥平均分:" + (sum / (arrays.length - 2)));
	}
}
