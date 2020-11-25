package day0411.entity;

public class Cat {
	public String name;
	public String color;
	public byte age;

	public Cat(String name, String color, byte age) {
		this.name = name;
		this.color = color;
		this.age = age;

	}

	public Cat(String name, String color) {
		this(name, color, (byte) 0);

	}

	public Cat(byte age) {
		this(null, null, age);

	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
}
