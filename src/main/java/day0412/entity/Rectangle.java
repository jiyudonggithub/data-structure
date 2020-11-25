package day0412.entity;

public class Rectangle extends Shape {
	public int edge1;
	public int edge2;

	public Rectangle() {

	}

	public Rectangle(int edge1, int edge2) {
		super();
		// super(perimeter, acreage);
		this.edge1 = edge1;
		this.edge2 = edge2;
	}

	/**
	 * 求矩形面积
	 * 
	 * @return
	 */
	public double getAcreage() {

		return this.edge1 * this.edge2;
	}

	/**
	 * 获得矩形周长
	 * 
	 * @return
	 */
	public double getPerimeter() {

		return (this.edge1 + this.edge2) * 2;
	}

}
