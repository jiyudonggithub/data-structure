package day0429.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		System.out.println(map.containsKey("d"));
		System.out.println(map.containsKey("b"));
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println("key为:"+keySet+"\t value为:"+map.get(keySet));
		}
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("key为:"+entry.getKey()+"\t value为:"+entry.getValue());
		}
		
	}

}
