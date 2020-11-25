package day0409;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		System.out.println("请选择所猜字符的长度");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int lenght = scanner.nextInt();
		System.out.println("请选择猜测难度");
		int nanDu = scanner.nextInt();
		String answer = getString(lenght, nanDu);
		String password;
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入您所猜得");
			password=scanner.next();
			if (password.equals("over")) {
				System.out.println("选手选择退出游戏");
				break;
			}
			if (password.equals(answer)) {
				System.out.println("恭喜您猜测正确，您的得分为"+(100-i*5));
				break;
			}else {
				System.out.println("很抱歉，您所猜的不正确");
			}
			
		}




	}

	public static String getString(int length,int command) {
		char[] arr2 = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
				'z', 'x', 'c', 'v', 'b', 'n', 'm', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'Q', 'W', 'E', 'R',
				'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N',
				'M' };
		char[] arr1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l',
				'z', 'x', 'c', 'v', 'b', 'n', 'm'};
		char[] arr0 = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		char[] arr;
		switch (command) {
		case 0:
			arr = arr0;
			break;
		case 1:
			arr = arr1;
			break;
		default:arr = arr2;
			break;
		}
		String string = "";
		int index;
		for (int i = 0; i < length; i++) {
			index = (int) (Math.random() * arr.length);
			string += arr[index];
		}
		System.out.println(Arrays.toString(arr));
		return string;

	}
}
