package day0507.entity;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		long t1 = System.currentTimeMillis();
		FileOutputStream fos = new FileOutputStream("e:\\vv.txt");
		FileInputStream fis = new FileInputStream("e:\\aaa.txt");

		byte[] bs = new byte[1024];
		int len;
		while ((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
		long t2 = System.currentTimeMillis();

		System.out.println("基本流的复制时间为：" + (t2 - t1));
		long t3 = System.currentTimeMillis();
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\vv.txt"));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:\\aaa.txt"));
		byte[] bs1 = new byte[1024];
		int len1;
		while ((len1 = bis.read(bs1)) != -1) {
			bos.write(bs1, 0, len1);
		}
		bis.close();
		bos.close();
		long t4 = System.currentTimeMillis();
		System.out.println("基本流的复制时间为：" + (t4 - t3));
	}
}
