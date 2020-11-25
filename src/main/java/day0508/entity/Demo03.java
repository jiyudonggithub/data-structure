package day0508.entity;

public class Demo03 {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			e.fillInStackTrace();
		}
		System.out.println("asas");
	}

}
