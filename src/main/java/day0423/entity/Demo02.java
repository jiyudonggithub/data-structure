package day0423.entity;

public class Demo02 {

	public static void main(String[] args) {
		String str = "zabc";
		shu("1 a d2A 2B^&^");
		System.out.println(str.compareTo("Z"));
		System.out.println(str.concat("bzc"));
	}

	public static void shu(String str) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num1++;
			} else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				num2++;
			} else if (str.charAt(i) == ' ') {
				num3++;
			} else {
				num4++;
			}
		}
		System.out.println("数字的个数：" + num1 + " 字母的个数：" + num2 + " 空格的个数：" + num3 + " 其他的个数：" + num4);
	}

}
