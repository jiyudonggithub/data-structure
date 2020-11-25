package day0501;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
	public static void main(String[] args) {
		String str = "good good study, day day up.";
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		String[] split = str.split("[^a-zA-Z]+");
		char[] cs = str.replaceAll("[^a-zA-Z]+", "").toCharArray();
		Integer value = 0;
		for (char c : cs) {
			value = maps.get(c)==null?1:maps.get(c)+1;
			maps.put(c, value);
		}
		System.out.println(maps);
		for (String string : split) {
			value = map1.get(string)==null?1:map1.get(string)+1;
			map1.put(string, value);
		}
		System.out.println(map1);
	}

}
