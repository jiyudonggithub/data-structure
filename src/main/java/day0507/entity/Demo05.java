package day0507.entity;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("e:\\aaa.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\xx.txt",true));
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("I love China");
		bw.newLine();
		char[] cbuf = new char[1024];
		isr.read(cbuf);
//		osw.write("abcdefg".toCharArray());
//		osw.write("我爱你中国");
		isr.close();
		bw.close();
		System.out.println(Arrays.toString(cbuf));
		System.out.println(cbuf[1]);
		
	}

}
