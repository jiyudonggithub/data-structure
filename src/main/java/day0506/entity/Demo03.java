package day0506.entity;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("F:\\Demo\\请大家留下自己的邮箱，近期会发出邀请信。.html", "r");
		RandomAccessFile ra = new RandomAccessFile("F:\\abc.txt", "rw");
		byte[] bytes = new byte[1024];
		int len;
		while ((len = raf.read(bytes)) != -1) {
			ra.write(bytes, 0, len);
		}
		raf.close();
		ra.close();
	}

}
