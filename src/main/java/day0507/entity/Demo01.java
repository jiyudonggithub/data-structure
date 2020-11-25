package day0507.entity;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("e:\\aaa.txt");
		FileOutputStream fos = new FileOutputStream("e:xx.txt",true);
		byte[] bs = new byte[1024];
		int len;
		while (( len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
		
	}

}
