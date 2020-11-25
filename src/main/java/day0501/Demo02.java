package day0501;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("HelloWorld.txt");
		File file1 = new File("src");
		File file2 = new File("\\a\\b\\c");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("Hellow");
		bw.flush();
		bw.newLine();
		bw.write("Big");
		bw.flush();
		bw.newLine();
		bw.write("Data");
		bw.flush();
		bw.newLine();
		bw.close();
		if (!file.exists()) {
			file.createNewFile();
		}
		file2.mkdirs();
		System.out.println(file1.isDirectory());
		System.out.println(file1.length());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file2.getAbsoluteFile());
		String absolutePath =file2.getAbsolutePath();
//		while (absolutePath.lastIndexOf("\\") != -1) {
			//file2.delete();
			absolutePath = file2.getAbsolutePath().substring(0,absolutePath.lastIndexOf("\\"));
			//file2 = new File(absolutePath);
			System.out.println(file2.getAbsoluteFile());
			//file2.delete();

//		}

		
	}



}
