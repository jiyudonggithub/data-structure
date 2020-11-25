package day0412.entity;

public class Triangle extends Shape {

	public int edge1;
	public int edge2;
	public int edge3;

	public Triangle() {
		super();
	}

	public Triangle(int edge1, int edge2, int edge3) {
		super();
		// super(perimeter, acreage);
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}

	/**
	 * 利用海伦公式求面积
	 * 
	 * @return
	 */
	public double getAcreage() {
		int sum = this.edge1 + this.edge2 + this.edge3;
		int sum_1 = this.edge1 + this.edge2 - this.edge3;
		int sum_2 = this.edge1 + this.edge3 - this.edge2;
		int sum_3 = this.edge2 + this.edge3 - this.edge1;

		return 0.25 * Math.sqrt(sum * sum_1 * sum_2 * sum_3);
	}

	/**
	 * 获得周长
	 * 
	 * @return
	 */
	public double getPerimeter() {

		return this.edge1 + this.edge2 + this.edge3;
	}

}
