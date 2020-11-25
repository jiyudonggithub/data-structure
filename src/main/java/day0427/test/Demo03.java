package day0427.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Demo03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int day = 0;
		// String str = "2018/12/6";
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入日期:");
		String str = scanner.next();
		while (!str.matches("\\d{4}\\/\\d{1,2}\\/\\d{1,2}")) {
			System.out.println("请重新输入:");
			str = scanner.next();
		}
		SimpleDateFormat smFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date adate = smFormat.parse(str);
		Calendar calendar = Calendar.getInstance();
		Calendar temp = Calendar.getInstance();
		calendar.setTime(adate);
		if (calendar.get(calendar.MONTH) > temp.JUNE) {
			temp.set(calendar.get(calendar.YEAR) + 1, temp.JUNE, 7);
			day = calendar.getActualMaximum(calendar.DAY_OF_YEAR) - calendar.get(calendar.DAY_OF_YEAR)
					+ temp.get(temp.DAY_OF_YEAR);
		} else if (calendar.get(calendar.MONTH) == 6) {
			if (calendar.get(calendar.DAY_OF_MONTH) >= 7) {
				temp.set(calendar.get(calendar.YEAR) + 1, temp.JUNE, 7);
				day = calendar.getActualMaximum(calendar.DAY_OF_YEAR) - calendar.get(calendar.DAY_OF_YEAR)
						+ temp.get(temp.DAY_OF_YEAR);
			} else {
				temp.set(calendar.get(calendar.YEAR), temp.JUNE, 7);
				day = day = temp.get(temp.DAY_OF_YEAR) - calendar.get(calendar.DAY_OF_YEAR);
			}
		} else {
			temp.set(calendar.get(calendar.YEAR), temp.JUNE, 7);
			day = temp.get(temp.DAY_OF_YEAR) - calendar.get(calendar.DAY_OF_YEAR);
		}
		System.out.println(day);

	}

}
