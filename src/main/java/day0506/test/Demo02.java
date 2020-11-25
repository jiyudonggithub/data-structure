package day0506.test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rafr = new RandomAccessFile("E:\\abc.mp4", "r");
		RandomAccessFile rafw = new RandomAccessFile("E:\\bce.mp4", "rw");
		byte[] bs = new byte[1024];
		int len;
		while ((len = rafr.read(bs)) != -1) {
			rafw.write(bs, 0, len);
		}
		rafr.close();
		rafw.close();
	}

}
