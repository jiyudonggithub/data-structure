package day0508.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo05 {
	public static void main(String[] args) {
		File file = new File("e:\\ss.txt");
		try {
			System.out.println(diver(file));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("==============");
	}

	public static double diver(File file) throws NumberFormatException, IOException, ArithmeticException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		double p1 = Double.parseDouble(br.readLine());

		double p2 = Double.parseDouble(br.readLine());
		br.close();
		return p1 / p2;
	}
}
