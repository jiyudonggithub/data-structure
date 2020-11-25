package day0503.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSpile {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("F:\\Demo\\请大家留下自己的邮箱，近期会发出邀请信。.html"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("email.txt"));
		Pattern pattern = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		String str = br.readLine();
		while (str != null) {
			Matcher matcher = pattern.matcher(str);
			while(matcher.find()){
				bw.write(matcher.group());
				bw.newLine();
				bw.flush();
				break;
			}
			str = br.readLine();
		}
		br.close();
		bw.close();

	}

}
