package day0426;


public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "96g.9.f3.6ffd.8v2.3.6f--9.89.56.g2$%&*fc";
		double sum = 0;
		String[] split = str.replaceAll("[-]+", "-").split("[^0-9-\\.]");
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			sBuffer.append(split[i].trim() + ",");
			System.out.println(split[i]);
		}
		String str2 = sBuffer.toString().trim();
		System.out.println(str2);
		System.out.println("================");
		String[] split2 = str2.split("[,]+");
		int[] index = new int[split2.length];
		for (int i = 0; i < split2.length; i++) {
			if (split2[i].startsWith(".")) {
				split2[i] = split2[i].substring(1);
			}
			if (split2[i].endsWith(".")) {
				split2[i] = split2[i].substring(0, split2[i].length() - 1);
			}
			int star = split2[i].indexOf(".");
			int last = split2[i].lastIndexOf(".");
			if (star != last) {
				index[i] = i;
				continue;
			}
			sum += Double.parseDouble(split2[i]);
		}
		System.out.println(sum);
		String[][] s1 = new String[index.length][];
		int a = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] != 0) {
				s1[a] = split2[i].split("\\.");
				for (int j = 0; j < s1[a].length; j++) {
					sum += Double.parseDouble(s1[a][j]);
					System.out.println(s1[a][j]);
				}
				a++;
			}
		}
		System.out.println("SUM :"+sum);

	}

}
