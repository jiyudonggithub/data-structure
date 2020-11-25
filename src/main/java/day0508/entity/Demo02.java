package day0508.entity;

import java.io.PrintWriter;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f:\\abc.txt");
		pw.print("anclld");
		pw.print(false);
		pw.close();
	}

}
