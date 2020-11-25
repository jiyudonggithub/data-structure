package day0412.entity;

public class Animal {
	public String color;
	public int num;

	public Animal(String color, int num) {
		super();
		this.color = color;
		this.num = num;
	}

	public void eat() {
		System.out.println("在吃饭");
	}

	public void sleep() {
		System.out.println("在睡觉");
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + ", num=" + num + "]";
	}
	

}
