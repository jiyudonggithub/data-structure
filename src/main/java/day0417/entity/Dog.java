package day0417.entity;

public class Dog extends Animai {
	
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String sex, int age, String brand) {
		super(sex, age, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
		
	}

	@Override
	public void bride() {
		// TODO Auto-generated method stub
		System.out.println("汪汪");
	}
	/**
	 * 狗看家
	 */
	public void lookHome() {
		System.out.println("狗看家");
	}

}
