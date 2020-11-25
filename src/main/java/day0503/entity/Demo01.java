package day0503.entity;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		File file = new File("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		FileReader fr = new FileReader(file);
		char[] sre = new char[1024];
		int len;
		while ((len = fr.read(sre)) != -1) {
			fw.write(sre, 0, len);
		}
		fw.close();
		fr.close();
	}

}
