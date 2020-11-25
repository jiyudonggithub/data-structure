package day0427.test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		System.out.println(new Date());
		System.out.println(new Date(500000000L));

		Date date = new Date();
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");

		SimpleDateFormat sDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		date = sDateFormat2.parse("2018/12/28 12:33:25");
		long sec = date.getTime();
		date.setTime(sec + 3 * 24 * 3600 * 1000L);
		System.out.println(sDateFormat.format(date));
		String str = "-2+34.5-5-9+-3-9";
		String[] split2 = str.split("\\+");
		String[][] s2 = new String[split2.length][];
		System.out.println(Arrays.toString(split2));
		double sum = 0;
		for (int i = 0; i < split2.length; i++) {
			split2[i] = split2[i].replaceAll("\\-", ",-");
			s2[i] = split2[i].split("\\,");
			for (int j = 0; j < s2[i].length; j++) {
				if (!s2[i][j].equals("")) {
					//System.out.print(s2[i][j]+"\t");
					sum += Double.parseDouble(s2[i][j]);
				}
			}
		}
		System.out.println("SUM:"+sum);

	}

}
