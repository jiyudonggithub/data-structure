package day0426;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = "3+(5+9)-2-(6-(-2+3)+5)+9";
		String str = "3+(5+9)-2-(6-(-2+3)+5)+9";
		String str1 = jiSuan(str);
		System.out.println("sum:" + jiShu(str1));
	}

	public static String jiSuan(String str) {

		int last = 0;
		int star = 0;
		StringBuffer sBuffer = new StringBuffer(str);
		while (last != -1) {
			double sum = 0;
			last = str.indexOf(")");
			if (last != -1) {
				star = str.substring(0, last).lastIndexOf("(");
				String substring = str.substring(star + 1, last);
				sBuffer.delete(star, last + 1);
				sum = jiShu(substring);
				sBuffer.insert(star, sum);
				str = sBuffer.toString();
				System.out.println(str);
				System.out.println("++++++++++++++++++++");
			}
		}
		return str;
	}

	public static double jiShu(String substring) {
		double sum = 0;
		String[] split2 = substring.split("\\+");
		String[][] s2 = new String[split2.length][];
		for (int i = 0; i < split2.length; i++) {
			split2[i] = split2[i].replaceAll("\\-", ",-");
			s2[i] = split2[i].split("\\,");
			for (int j = 0; j < s2[i].length; j++) {
				if (!s2[i][j].equals("")) {
					sum += Double.parseDouble(s2[i][j]);
				}
			}
		}
		return sum;
	}
}