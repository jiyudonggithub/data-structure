package day0412.entity;

public class Student extends People {
	public String sex;
	/**
	 *无参构造
	 */
	public Student() {
		
	}
	/**
	 * 有参构造
	 * @param name
	 * @param age
	 * @param sex
	 */
	public Student(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	/**
	 * 显示个人信息
	 */

	@Override
	public String toString() {
		return "Student [sex=" + sex + ", name=" + name + ", age=" + age + "]";
	}
	

	
	
}
