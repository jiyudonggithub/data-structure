package day0508.entity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) throws FileNotFoundException {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "aaaaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		map.put("e", "eeee");
		map.put("d", "dddd");

//		Emp emp = new Emp(map);
		FileReader file = new FileReader("f:\\aaa.txt");

	}

}
