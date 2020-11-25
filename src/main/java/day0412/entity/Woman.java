package day0412.entity;

public class Woman extends Human {
	public void human() {
		System.out.println("这是个女人");

	}

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + "]";
	}
	
}
