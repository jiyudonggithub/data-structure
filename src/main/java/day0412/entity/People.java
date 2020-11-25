package day0412.entity;

public class People {
	public String name;
	public int age;
	
	/**
	 * 午餐构造
	 */
	public People(){
		
	}
	/**
	 * 有参构造
	 * @param name
	 * @param age
	 */
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 显示信息
	 */
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.age);

	}
	
}
