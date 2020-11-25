package day0411.test;

import day0411.entity.Hero;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("杨戬");
		System.out.println(hero);
		for (int i = 0; i < 6; i++) {
			hero.hurt();
		}
		hero.eat(35);
		for (int i = 0; i <22; i++) {
			hero.hurt();
			hero.eat(5);
			System.out.println(hero);
		}
		hero.go();
		
		
	}

}
