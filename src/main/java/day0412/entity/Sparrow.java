package day0412.entity;

public class Sparrow extends Brid {
	public int age;
	public double weight;
	

	public Sparrow() {
		super();
	}

	public Sparrow(int wing, int log, int age, double weight) {
		super(wing, log);
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Sparrow [age=" + age + ", weight=" + weight + ", Wing=" + Wing + ", log=" + log + "]";
	}
	
	
	

}
