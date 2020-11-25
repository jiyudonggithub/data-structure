package day0423.entity;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		String str = "   06fck6454615     FVJBKjllui;khn              ";
		System.out.println(str.replaceAll("\\D", "*"));
		System.out.println(str.replace("fck", "ag"));
		System.out.println(Arrays.toString(str.split("15")));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println("==============");
		System.out.println(Arrays.toString(str.split(";")));
		jae("342221199510139218");
		jae2("342221199510139268");
		// String[] split = str.split("\\s");
		// System.out.println(split[0]);
		System.out.println(delFreeBrak(str));
		// String s1 = split[0]+split[1];
		// System.out.println(s1);
		// System.out.println(delFreeBrak(str));
		System.out.println("==============");
		System.out.println(name(str));
		stringMove("hello word", 5);
		stringMove("hello word", -6);
		System.out.println("==============");
		move("hello word", 5);
		move("hello word", -6);
		System.out.println("==============");
		score("01#张三#20-02#李四#40-03#王五#60-04#赵六#80");
		System.out.println("==============");
	}

	public static String delFreeBrak(String str) {
		int intex = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(str.length() - i - 1) > ' ') {
				intex = str.length() - i;
				break;
			}
		}
		return str.substring(0, intex);
	}

	public static String name(String str) {
		for (int i = str.length() - 1; i > 0; i--) {
			if (str.charAt(i) == ' ') {
				str = str.substring(0, i);
			} else {
				break;
			}
		}
		return str;
	}

	public static void jae(String card) {
		String sexString = card.substring(card.length() - 2, card.length() - 1);
		System.out.println(sexString);
		int sex = Integer.parseInt(sexString);
		if (sex % 2 == 0) {
			System.out.println("女性");
		} else {
			System.out.println("男性");
		}
	}

	public static void jae2(String card) {
		char sex = card.charAt(card.length() - 2);
		System.out.println(sex);
		if (sex % 2 == 0) {
			System.out.println("女性");
		} else {
			System.out.println("男性");
		}
	}

	public static String creatHuiWen(String str) {
		StringBuilder s1 = new StringBuilder(str);
		String s2 = String.valueOf(s1.reverse());
		return s1 + "-" + s2;
	}

	public static void stringMove(String str, int num) {
		boolean flag = num > 0;
		num = flag ? num : -num;
		char[] s1 = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			s1[i] = str.charAt(i);
		}
		if (flag) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < s1.length - 1; j++) {
					s1[j] = (char) (s1[j] + s1[j + 1]);
					s1[j + 1] = (char) (s1[j] - s1[j + 1]);
					s1[j] = (char) (s1[j] - s1[j + 1]);
				}
			}
			System.out.println(String.valueOf(s1));
		} else {
			for (int i = 0; i < num; i++) {
				for (int j = s1.length - 1; j > 0; j--) {
					s1[j] = (char) (s1[j] + s1[j - 1]);
					s1[j - 1] = (char) (s1[j] - s1[j - 1]);
					s1[j] = (char) (s1[j] - s1[j - 1]);
				}
			}
			System.out.println(String.valueOf(s1));
		}

	}

	public static void move(String str, int num) {
		if (num > 0) {
			int a = num % str.length();
			String str1 = str.substring(a);
			String str2 = str.substring(0, a);
			System.out.println(str1 + str2);
		} else {
			int a = (-num) % str.length();
			String str1 = str.substring(str.length() - a);
			String str2 = str.substring(0, str.length() - a);
			System.out.println(str1 + str2);
		}

	}

	public static void score(String str) {
		int sum = 0;
		String[] s = str.split("-");
		String[][] s1 = new String[s.length][];
		for (int i = 0; i < s.length; i++) {
			s1[i]=s[i].split("#");
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s1[i][0]);
			System.out.print(s1[i][1]);
			System.out.print(s1[i][2]);
			System.out.println();
			sum += Integer.parseInt(s1[i][2]);
		}
		System.out.println("总分："+sum);
	}
		

}
