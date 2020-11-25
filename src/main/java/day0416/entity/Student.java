package day0416.entity;

public class Student {

	public static final String USER_TNAME = "厦捌";
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getUserTname() {
		return USER_TNAME;
	}

	public Student(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + "]";
	}

}
