package day0410.entity;

public class Car {
	public String brand;
	public String colour;
	public int price;
	public double weight;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", colour=" + colour + ", price=" + price + "]";
	}

	public boolean equals(Car car) {
		return brand.equals(car.brand) && price == car.price;
	}

}
