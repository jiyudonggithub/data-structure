package day0506.entity;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Deom06 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rfile = new RandomAccessFile("F:\\Document\\JAVA\\practice\\ABC.txt", "r");
		RandomAccessFile wfile = new RandomAccessFile("F:\\Document\\JAVA\\practice\\BB.txt", "rw");
		int len;
		long length = rfile.length();
		rfile.seek(length - 1);
		while (length != 0) {
			len = rfile.read();
			System.out.println(length);
			length--;
			rfile.seek(length);
			 wfile.write((char) len);
		}
		rfile.seek(0);
		len = rfile.read();
		wfile.write((char) len);
		wfile.close();
		rfile.close();

	}

}
