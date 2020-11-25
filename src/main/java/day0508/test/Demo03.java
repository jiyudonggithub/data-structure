package day0508.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		File file = new File("F:\\标准答案.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String readLine = br.readLine();
		readLine = readLine.substring(readLine.indexOf(":")+1);
		System.out.println(readLine);
		System.out.println(file.getName());
		String name = file.getName();
		name = name.substring(0, name.indexOf(".txt"));
		System.out.println(name);
		System.out.println("2:ac|a|c".contains("a"));
		System.out.println("abcd1234_abcd".matches("^\\w{8,14}$"));
		br.close();
		
	}

}
