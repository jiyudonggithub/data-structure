package day0510.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 implements Runnable {
	public static boolean flag = true;


	@Override
	public void run() {
		while (flag) {
			SimpleDateFormat sd = new SimpleDateFormat("YYYY年MM月dd HH:mm:ss");
			Date date = new Date();
			String format = sd.format(date);
			try {
				Thread.sleep(5000);
				System.out.println(format);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
