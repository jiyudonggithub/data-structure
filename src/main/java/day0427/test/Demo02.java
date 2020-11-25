package day0427.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Date adata = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date bdata = simpleDateFormat.parse("1996-12-19");
		long sun = adata.getTime() - bdata.getTime();
		System.out.println("活了" + (sun / (24 * 3600 * 1000L)) + "天");

		Calendar calendar = Calendar.getInstance();
		calendar.set(calendar.YEAR, 2008);
		calendar.set(calendar.MONTH, calendar.JULY);
		calendar.set(calendar.DAY_OF_MONTH, 26);
		System.out.println(calendar.get(calendar.YEAR));
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
		System.out.println(calendar.getTime());
		calendar.add(calendar.MONTH, 24);
		System.out.println(calendar.getTime());
		int max = calendar.getActualMaximum(calendar.DAY_OF_YEAR);
		System.out.println(max);

	}

}
