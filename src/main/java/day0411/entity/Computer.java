package day0411.entity;



public class Computer {
	public String brand;
	public Mouse mouse;
	public double price;
    public Computer(String brands,Mouse mouses,double prices) {
    	 brand = brands;
    	 mouse = mouses;
    	 price = prices;
		
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", mouse=" + mouse + ", price=" + price + "]";
	}

}
