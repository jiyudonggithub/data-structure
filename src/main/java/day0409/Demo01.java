package day0409;

public class Demo01 {

	public static void main(String[] args) {
		int[][] arrays;
		arrays = new int[][]{{3,5,6},{7,8,9},{2,1,4}};
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays[i].length; j++) {
				System.out.print(arrays[i][j]+"\t");
			}
			System.out.println();
		}
		

	}
	/**
	 * 两个整数之和
	 * a+b
	 * @param a
	 * @param b
	 * @return
	 */
	public static int plus(int a ,int b) {
		
		return a+b;
		
	}
	/**
	 * 一个整数和小数之和
	 * @param a
	 * @param b
	 * @return
	 */
	public static double plus(int a ,double b) {
		
		return a+b;
		
	}
	/**
	 * 两个整数的差
	 * a-b
	 * @param a
	 * @param b
	 * @return
	 */
	public static int subtraction(int a ,int b) {
		
		return a-b;
		
	}
	/**
	 * 两个数的成绩
	 * a*b
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiplication(int a ,int b) {
		
		return a*b;
		
	}
	/**
	 * 两数的
	 * @param a
	 * @param b
	 * @return
	 */
	public static double division(int a ,int b) {
		
		return a*1.0/b;
		
	}


}
