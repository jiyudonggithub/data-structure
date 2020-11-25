package day0417.test;

import day0417.entity.Animai;
import day0417.entity.Cat;
import day0417.entity.Dog;

public class AnimialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animai dog = new Dog();
		Animai cat = new Cat();
		dog.eat();
		dog.bride();
		cat.eat();
		cat.bride();
		if (dog instanceof Dog) {
			((Dog) dog).lookHome();
		} else {
			System.out.println("类型不匹配");
		}
		if (cat instanceof Cat) {
			((Cat) cat).catchMouse();
		} else {
			System.out.println("类型不匹配");
		}

	}

}
