package day0426;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("15155727229".matches("(\\+86)?\\s*\\d{11}"));
		System.out.println("#sdasd,".matches("^#\\w*,$"));
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "ab"+"c";
		String s4 = s2;
		System.out.println(s1 == s2);
		System.out.println("============");
		System.out.println(s1 == s3);
		System.out.println("============");
		System.out.println(s1 == s4);
	}

}
