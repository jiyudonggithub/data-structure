package day0428.entity;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2 = new String("str01")+new String("6");
		str2.intern();
		String str1 = "str016";
		System.out.println(str2 == str1);
		System.out.println("====================");
		String s1 = new String("1");
		s1.intern();
//		String s3 = s1.intern();
		String s2 = "1";
		System.out.println(s2 == s1);
//		System.out.println(s2 == s3);
		

	}

}
