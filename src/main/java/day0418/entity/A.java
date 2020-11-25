package day0418.entity;

@SuppressWarnings ("all")
public class A {

	public String name;
	private int age;
	protected String sex;

	public A() {
		super();
	}

	public A(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	private A (int age, String sex) {
		super();
		this.age = age;
		this.sex = sex;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	protected void tt() {

		System.out.println("ajkska");
	}
	
	public void slep() {

		System.out.println(this.name+"是个"+this.age+"岁的"+this.sex);
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	

}
