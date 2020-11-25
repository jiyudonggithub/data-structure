package day0508.entity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo04 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		BufferedReader br = null;
		try {
			 br = new BufferedReader(new FileReader("e:\\objs.txt"));
			 String str;
			 while ((str = br.readLine()) != null) {
				list.add(getSthdent(str));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		for (Student student : list) {
			System.out.println(student);
		}

	}
	public static Student getSthdent(String str){
		Student student = new Student();
		str = str.replaceAll("[{}]", " ");
		Pattern pattern = Pattern.compile("[:][\\w[\u4e00-\u9fa5]]+[ ]+");
		Matcher matcher = pattern.matcher(str);
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				matcher.find();
				String group = matcher.group().trim();
				student.setName(group.substring(1));
				break;
			case 1:
				matcher.find();
				String group1 = matcher.group().trim();
				student.setAddress(group1.substring(1));
				break;
			case 2:
				matcher.find();
				String group2 = matcher.group().trim();
				student.setTel(group2.substring(1));
				break;
			case 3:
				matcher.find();
				String group3 = matcher.group().trim();
				student.setGender(group3.substring(1));
				break;
			default:
				break;
			}
		}	
		return student;
	
		
	}

}
