package day0411.test;

import day0411.entity.Cat;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("加菲", "橘色");
		Cat cat1 = new Cat("加菲", "橘色",(byte) 3);
		Cat cat2 = new Cat((byte) 3);
		System.out.println(cat);
		System.out.println(cat1);
		System.out.println(cat2);
	}

}
