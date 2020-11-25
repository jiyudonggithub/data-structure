package day0507.entity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("e:\\123.mp4");
		FileOutputStream fos = new FileOutputStream("d:\\132.mp4");
		byte[] bs = new byte[1024];
		int len;
		while ((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
	}

}
