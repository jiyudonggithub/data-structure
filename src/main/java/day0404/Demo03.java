package day0404;

//import java.util.Stack;

public class Demo03 {

	public static void main(String[] args) {

		/*for (int i = 100; i <= 999; i++) {
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;
			if (i == (int) (Math.pow(a, 3)) + (int) (Math.pow(b, 3)) + (int) (Math.pow(c, 3))) {
				System.out.println();
			}//3x+xy=486
				x^3y^2+3xy-6y^2=182
				3y-5y^2=182
		}*/
		/*for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				int sum = i * i * i * j * j + 3 * i * j - 6 * j * j;
				if (sum == 182) {
					System.out.println("x=" + i + ",y=" + j);
				}

			}
		}
		System.out.println("无正整数解");*/
		//int[] arr;
		double[] arr1 = new double[5];//0.0
		char[] arr2= new char[5];	//空
		String[] arr3= new String[5];//null
		boolean[] arr4= new boolean[5];//false
		//arr = new int[]{12,16,85,97,45,42,49};
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/System.out.println("=============");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}System.out.println("=============");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}System.out.println("=============");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
			
		}System.out.println("=============");
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
			
		}System.out.println("=============");
	}

}
