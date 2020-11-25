package day0412.entity;

public class Dog extends Animal {
	public String name;

	public Dog(String color, int num, String name) {
		super(color, num);
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void lookHome() {
		System.out.println(this.name + "看家");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", num=" + num + "]";
	}

	public void eat() {
		System.out.println(this.name + "在吃狗粮");

	}

}
