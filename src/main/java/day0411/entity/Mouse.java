package day0411.entity;

public class Mouse {
	public String brand;
	public String color;
	public double price;

	public Mouse(String brands, String colors, double prices) {
		brand = brands;
		color = colors;
		price = prices;

	}

	@Override
	public String toString() {
		return "Mouse [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

}
