package day0410.entity;

import java.util.Arrays;

public class Student {
	String name;
	static String tName;
	String adress;
	int score;
	byte age;
	String[] hobby;

	public void study() {
		System.out.println(name + "在学习");
	}

	public void eat() {
		System.out.println(name + "在吃饭");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", adress=" + adress + ", score=" + score + ", age=" + age + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}

}
