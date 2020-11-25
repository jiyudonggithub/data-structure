package day0506.entity;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rFile = new RandomAccessFile("F:\\Document\\JAVA\\practice\\ABC.txt", "r");
		int len;
		while ((len = rFile.read()) != -1) {
			rFile.skipBytes(3);
			System.out.println("文件指针的位置："+rFile.getFilePointer());
		}
		if (rFile.getFilePointer() == rFile.length()) {
			rFile.seek(23);
		}
		System.out.println("文件指针的位置："+rFile.getFilePointer());
		rFile.close();
		
	}

}
