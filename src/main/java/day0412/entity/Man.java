package day0412.entity;

public class Man extends Human {
	
	public void human() {
		System.out.println("这是个男人");
		
	}

	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	

}
