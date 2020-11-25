package day0417.entity;

public class Cat extends Animai {

	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String sex, int age, String brand) {
		super(sex, age, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	@Override
	public void bride() {
		// TODO Auto-generated method stub
		System.out.println("(>^ω^<)喵");
	}
	/**
	 * 猫抓老鼠
	 */
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}

}
