package day0506.entity;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		/*
		 * 将图片sasasasa.png重名为aaa.png
		 * 并复制到D盘
		 * 
		 * */
		File file = new File("e:\\4b8a9a92887e5a150cd7cacfca744c91.png");
		File file2 = new File("e:\\aa.png");
		file.renameTo(file2);
		RandomAccessFile rar = new RandomAccessFile(file2,"r");
		RandomAccessFile raw = new RandomAccessFile("f:\\aa.png","rw");
		byte[] bs = new byte[1024];
		int len;
		while ((len = rar.read(bs)) != -1) {
			raw.write(bs, 0, len);
		}
		raw.close();
		rar.close();
	}

}
