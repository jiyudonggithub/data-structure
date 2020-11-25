package day0423.test;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a test of java";
		System.out.println("s的个数"+jiS(str));
		System.out.println("取出test:"+tset(str));
		System.out.println("第一个字母大写");
		pint(str);
		System.out.println("倒序");
		pintResves(str);
		System.out.println("打印单词");
		res(str);
	}
	/**
	 * 计算s的个数
	 * @param str
	 * @return
	 */
	private static int jiS(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 's') {
				num++;
			}
		}
		return num;
	}
	private static String tset(String str) {
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if ("test".equals(split[i])) {
				return split[i];
			}
		}
		return null;
	}
	public static char[] re(String str) {
		return str.toCharArray();
	}
	public static void res(String str) {
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {	
				System.out.println(split[i]); 	
		}
	}
	private static void pint(String str) {
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			  split[i] = split[i].toUpperCase();
			  StringBuffer sBuffer = new StringBuffer();
			  sBuffer.append(split[i].charAt(0));
			  split[i] = split[i].toLowerCase();
			  sBuffer.append(split[i].substring(1));
			  System.out.println(sBuffer);
			}
		}
	private static void pintResves(String str) {
			  StringBuffer sBuffer = new StringBuffer(str);
			  sBuffer.reverse();
			  System.out.println(sBuffer);
			}
		
	
}
