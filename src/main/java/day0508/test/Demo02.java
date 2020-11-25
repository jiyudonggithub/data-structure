package day0508.test;

import java.util.Scanner;

/**
 * 
 * @author jiyudong
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] split = str.split(";");
		String[] red = split[0].split(",");
		String[] blue = split[1].split(",");
		String[] grenn = split[2].split(",");
		double xrb = Math.pow(Double.parseDouble(red[0]) - Double.parseDouble(blue[0]), 2);
		double yrb = Math.pow(Double.parseDouble(red[1]) - Double.parseDouble(blue[1]), 2);
		double xrg = Math.pow(Double.parseDouble(red[0]) - Double.parseDouble(grenn[0]), 2);
		double yrg = Math.pow(Double.parseDouble(red[1]) - Double.parseDouble(grenn[1]), 2);
		double xbg = Math.pow(Double.parseDouble(grenn[0]) - Double.parseDouble(blue[0]), 2);
		double ybg = Math.pow(Double.parseDouble(grenn[1]) - Double.parseDouble(blue[1]), 2);
		double drb = Math.sqrt(xrb + yrb);
		double drg = Math.sqrt(xrg + yrg);
		double dbg = Math.sqrt(xbg + ybg);

		if (drb < (Double.parseDouble(red[2]) + Double.parseDouble(blue[2]))) {
			System.out.println("红蓝圈相交");
		}else {
			System.out.println("红蓝圈不相交");
		}
		if (drg < (Double.parseDouble(red[2]) + Double.parseDouble(grenn[2]))) {
			System.out.println("红绿圆相交");
		}else {
			System.out.println("红绿圆不相交");
		}
		if (dbg < (Double.parseDouble(blue[2]) + Double.parseDouble(grenn[2]))) {
			System.out.println("蓝绿圆相交");
		}else {
			System.out.println("蓝绿圆不相交");
		}
	}

}
