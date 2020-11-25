package day0415.test;


public class Squr {

	public static void main(String[] args) {
		int num = 2400;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		while (true) {
			while (a * a - num <= 0) {
				if (a * a == num) {
					return;
				}
				a += 10;
				System.out.println(a);
			}
			a -= 10;
			while ((a + b) * (a + b) - num <= 0) {
				if ((a + b) * (a + b) == num) {
					return;
				}
				b++;
				System.out.println(b);
			}
			b--;
			while ((a + b + c) * (a + b + c) - num <= 0) {
				if ((a + b + c) * (a + b + c) == num) {
					return;
				}
				c += 0.1;
				System.out.println(c);
			}
			c -= 0.1;
			while ((a + b + c + d) * (a + b + c + d) - num <= 0) {
				if ((a + b + c + d) * (a + b + c + d) == num) {
					return;
				}
				d += 0.01;
				System.out.println(d);
			}
			d -= 0.01;
			break;
		}
		System.out.println( a + b  + c + d);
	}

}
