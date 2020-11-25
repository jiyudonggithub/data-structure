package day0412.entity;

public class Father {
	public String name;
	protected String job;
	private int age;
	String gener;
	@Override
	public String toString() {
		return "Father [name=" + name + ", job=" + job + ", age=" + age + ", gener=" + gener + "]";
	}
	public void eat(){
		System.out.println("在吃饭");	
	}
	
}
