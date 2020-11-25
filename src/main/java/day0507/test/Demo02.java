package day0507.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:\\aaa.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\aaa.txt"));
		BufferedWriter oos = new BufferedWriter(osw);
		BufferedReader ois = new BufferedReader(isr);
		oos.close();
		ois.close();
          
	}

}
