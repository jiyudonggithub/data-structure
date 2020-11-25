package day0412.test;

import day0412.entity.Cat;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("橘色", 4, "加菲");
		cat.eat();
		cat.sleep();
		cat.catchMouse();
        System.out.println(cat);
	}

}
