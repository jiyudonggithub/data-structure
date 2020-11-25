package day0412.entity;

public class Cat extends Animal {

	public String name;

	public Cat(String color, int num, String name) {
		super(color, num);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void catchMouse() {
		System.out.println(this.name + "再抓老鼠");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", num=" + num + "]";
	}

	public void eat() {
		System.out.println(this.name + "在吃猫粮");

	}

}
