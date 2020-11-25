package day0402;

import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		/*
		 * c++; byte temp; temp=c;6 c=c+1; 7 c=temp 6 ++c;
		 * 
		 */
		/*
		 * Scanner scanner = new Scanner(System.in); int num =
		 * scanner.nextInt();
		 */
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			System.out.println(random.nextInt(3));

		}
	}

}
