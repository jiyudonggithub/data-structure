package day0411.test;

import day0411.entity.Computer;
import day0411.entity.Mouse;
import day0411.entity.People;

public class Pcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse mouse = new Mouse("万科","黑色",19.8);
		Computer computer = new Computer("方洲",mouse,1969.8);
		People people = new People();
		people.name = "方万洲";
		people.pc = computer;
		people.aderss = "中国重庆";
		people.sex = "小哥哥";
		people.age = 20;
		System.out.println(people);
	}

}
