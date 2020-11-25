package day0409;

import java.util.Arrays;

//import java.util.Arrays;

//import javax.print.attribute.IntegerSyntax;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * 写一个方法用来求绝对值
		 * 
		 */
		// System.out.println(absoluteValue(-9));
		// System.out.println(absoluteValue(-9.8));
		// System.out.println(plus(3,4,5,6,7,8,9,10,2,1));
		System.out.println(HybridAlgorithm(5, 6, 7, 8, 9));
		System.out.println(HybridAlgorithm(0, 6.3, 7.2, 8.1, 9.8));
		int[] arrays = { 7, 8, 9, 1, 3, 16, 5, 15 };
		maoPao(arrays, true);
		System.out.println(Arrays.toString(arrays));
		maoPao(arrays, false);
		System.out.println(Arrays.toString(arrays));
	}

	/**
	 * 求整数的绝对值
	 * 
	 * @param a
	 * @return
	 */
	public static int absoluteValue(int a) {

		return a > 0 ? a : -a;

	}

	/**
	 * 求小数的绝对值
	 * 
	 * @param a
	 * @return
	 */
	public static double absoluteValue(double a) {

		return a > 0 ? a : -a;

	}

	/**
	 * 计算整型可变变量的和
	 * 
	 * @param a
	 * @return
	 */
	public static int plus(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	/**
	 * 计算小数可变变量的和
	 * 
	 * @param a
	 * @return
	 */
	public static double plus(double...a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	/**
	 * 
	 * 
	 * @param a所传的命令正的时候传数据的和 负的时候传数据的乘积 0的时候传数据的平均值
	 * @param b所传的数据 
	 * @return
	 */
	public static double HybridAlgorithm(int a, double...b) {
		if (a > 0) {
			double data = 0;
			data = plus(b);
			return data;
		} else if (a > 0) {
			int sum = 1;
			for (int i = 0; i < b.length; i++) {
				sum *= b[i];
			}
			return sum;
		} else {
			double data = 0;
			data = plus(b);
			return data / b.length;
		}
	}
	/**
	 * 
	 * @param arr
	 * @param flag 确定冒泡是升序还是降序 true 是升序false是降序
	 */
	public static void maoPao(int[] arr,boolean flag) {
		 for (int i = 0; i < arr.length-1; i++) {
				
				for (int j = 0; j < arr.length-i-1; j++) 
				{	
					
						if(flag?arr[j] > arr[j+1]:arr[j] < arr[j+1])
						{
							arr[j] = arr[j] + arr[j+1];
							arr[j+1] = arr[j] - arr[j+1];
							arr[j] = arr[j] - arr[j+1];
						}
					
				}
			}
		
	}

}
