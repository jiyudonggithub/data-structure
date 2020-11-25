package day0422;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefg";
		String s3 = "someapp/manager/emplist.action";
		char c = s1.charAt(5);
		System.out.println(c);
		int compareTo = "cvf".compareTo(s1);
		System.out.println(compareTo);
		String concat = s1.concat("dklas");
		System.out.println(concat);
		System.out.println(s1.contains("bcde"));
		System.out.println(s1.contentEquals("abcdefg"));
		System.out.println(s1.contentEquals("abdefg"));
		System.out.println("=========");
		System.out.println(s1.endsWith("g"));
		System.out.println(s1.startsWith("a"));
		System.out.println("=========");
		System.out.println(String.valueOf(3.14159265857));
		StringBuilder s2 = new StringBuilder(s1);
		s2.append("dsfsd0").append(true).insert(3, "jiyudong");
		System.out.println(s2.toString());
		s2.delete(3, 10);
		System.out.println(s2.toString());
		System.out.println(s2.length());
		s2.replace(14, 18, "flase");
		System.out.println(s2.toString());
		s2.reverse();
		System.out.println(s2.toString());
		System.out.println("我".length());
		System.out.println(s1.substring(3, 5));
		int index = s3.lastIndexOf("/");
		System.out.println(index);
		StringBuilder s4 = new StringBuilder(s3);
		String str = s4.substring(index + 1);
		System.out.println(str);
		String s5 = "able was i ere i saw elba";
		StringBuilder s6 = new StringBuilder(s5);
		String s8 = String.valueOf(s6).substring(0, (s5.length() / 2) - 1);
		String s7 = s5.substring(0, (s5.length() / 2) - 1);

		if (s7.equals(String.valueOf(s8))) {

			System.out.println(s5 + "是回文");

		} else {
			System.out.println(s5 + "不是回文");
		}
		StringBuilder s9 = new StringBuilder();
		for (char c1 = '\u4e00',i = 1; c1 <= '\u9fa5'; c1++, i++) {
			s9.append(c1);
			if (i % 50 == 0) {
				s9.append("\n");
			}
		}
		System.out.println(s9.length());
		System.out.println(s9.toString());
	}

}
