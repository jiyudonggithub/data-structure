package day0616.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Read {

	public static void main(String[] args) throws Exception {
		// FileReader fr = new FileReader("F:\\Desktop\\result1\\part-m-00000");
		FileReader fr = new FileReader("F:\\Desktop\\input\\access.log");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String userAgent;
		Map<String, Integer> hashMap = new HashMap<String,Integer>();
		while ((str = br.readLine()) != null) {
			String[] split = str.toString().split("\t");
			if (!split[1].equals("null") && !split[8].equals("null")) {
				userAgent = split[8];
				if (!userAgent.equals("null")) {
					UserAgent uAgent = UserAgentUtil.getUserAgent(userAgent);
					if (uAgent != null) {
						String browser = uAgent.getBrowserType();
						if (browser != null) {
							System.out.println(browser);
							Integer integer = hashMap.get(browser);
							if (!split[2].equals("null")) {
								if (integer == null) {
									hashMap.put(browser +"\t"+split[2], 1);
								}else {
									hashMap.put(browser +"\t"+split[2], integer+1);
								}
							}
							
						}
					}
				}
			}
		}
		Set<String> keySet = hashMap.keySet();
		for (String string : keySet) {
			System.out.println(string +"\t" + hashMap.get(string));
		}
		br.close();
		fr.close();

	}

	public static String analysisIP(String str, String split, String city) {
		String str1 = str.substring(0, str.indexOf(split)) + city + "\t";
		String str2 = str.substring(str.indexOf(split), str.length());
		return (str1 + str2);
	}

}
