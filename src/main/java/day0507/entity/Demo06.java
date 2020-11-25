package day0507.entity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo06 {
public static void main(String[] args) throws Exception {
	InputStreamReader isr = new InputStreamReader(new FileInputStream("e:\\aaa.txt"));
	BufferedReader br = new BufferedReader(isr);
	String string;
	while ((string =br.readLine()) != null) {
		System.out.print(string);
	}
	br.close();
 }

}
