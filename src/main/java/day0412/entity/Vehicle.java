package day0412.entity;

public class Vehicle {
	public int wheels;
	public double weight;

	public Vehicle(int wheels, double weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", weight=" + weight + "]";
	}

}
