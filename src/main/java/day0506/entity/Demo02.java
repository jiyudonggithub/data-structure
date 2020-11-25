package day0506.entity;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入路径：");
		String nextLine2 = scanner.nextLine();
		RandomAccessFile raf = new RandomAccessFile(new File(nextLine2), "rw");
		System.out.println("请输入所写的字符串：");
		String nextLine = scanner.nextLine();
		raf.write(nextLine.getBytes());
		raf.close();
		scanner.close();
	}

}
