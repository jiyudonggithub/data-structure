package day0506.test;

import java.util.HashMap;
/**
 * 
 * @author jiyudong
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		Country cn = new Country("CN","中华人民共和国");
		Country ru = new Country("RU","俄罗斯联邦");
		Country us = new Country("US","美利坚合众国");
		Country fr = new Country("FR","法国");
		map.put(cn.getEnglishname(), cn.getChiesename());
		map.put(ru.getEnglishname(), ru.getChiesename());
		map.put(us.getEnglishname(), us.getChiesename());
		map.put(fr.getEnglishname(), fr.getChiesename());

		System.out.println("CN对应的国家是："+map.get(cn.getEnglishname()));
		System.out.println("MAP中共有"+map.size()+"组数据");
		System.out.println("Map是否含有FR的key吗？"+map.containsKey(fr.getEnglishname()));
		if (map.containsKey(fr.getEnglishname())) {
			map.remove(fr.getEnglishname());
		}
		System.out.println("Map是否含有FR的key吗？"+map.containsKey(fr.getEnglishname()));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		map.clear();
		System.out.println("已清空Map");
	}

}
class Country
{
	private String  Englishname;
	private String  Chiesename;
	public Country(String englishname, String chiesename) {
		super();
		Englishname = englishname;
		Chiesename = chiesename;
	}
	public String getEnglishname() {
		return Englishname;
	}
	public void setEnglishname(String englishname) {
		Englishname = englishname;
	}
	public String getChiesename() {
		return Chiesename;
	}
	public void setChiesename(String chiesename) {
		Chiesename = chiesename;
	}
	@Override
	public String toString() {
		return "Country [Englishname=" + Englishname + ", Chiesename=" + Chiesename + "]";
	}
	

}
