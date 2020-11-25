package day0412.entity;

public class Car extends Vehicle {
	public int loader;

	public Car(int wheels, double weight, int loader) {
		super(wheels, weight);
		this.loader = loader;
	}

	@Override
	public String toString() {
		return "Car [loader=" + loader + ", wheels=" + wheels + ", weight=" + weight + "]";
	}

}
