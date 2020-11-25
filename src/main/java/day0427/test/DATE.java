package day0427.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DATE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		Date date = format.parse("2017年06月06日");
		Calendar a = Calendar.getInstance();
		a.setTime(date);
		System.out.println(a.get(6));

	}

}
