package day0427.entity;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1242056";
		int sum = 0;
		if (str.matches("\\d+")) {
			char[] charArray = str.toCharArray();
			int[] num = new int[charArray.length];
			for (int i = 0; i < charArray.length; i++) {
				num[i] = charArray[i] -48;
				sum += Math.pow(10,charArray.length-1-i)*num[i];
			}
			System.out.println(sum);
		}else {
			System.out.println("输入的字符串不合法");
		}
	}

}
