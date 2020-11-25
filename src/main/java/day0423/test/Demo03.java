package day0423.test;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hijavahehejavahejava";
		String str2 = "java";
		String[] split = str1.split(str2);
		int c = split.length-1;
		if (str1.lastIndexOf(str2) ==str1.length()-str2.length()) {
			c += 1;
		}
		System.out.println(c);
  }
}
