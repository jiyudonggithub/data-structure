package day0402;

import java.util.Scanner;

public class Demo04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		 
		 System.out.println("请输入数字：");
		Scanner scanner = new Scanner(System.in);
		 String math = scanner.next();
		 System.out.println(math);
		 System.out.println(math.equals('b'));
		

	}

}
