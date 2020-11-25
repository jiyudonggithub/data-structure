package day0412.entity;

public class Shape {
	public double perimeter;
	public double acreage;

	public Shape() {

	}

	public Shape(int perimeter, int acreage) {
		super();
		this.perimeter = perimeter;
		this.acreage = acreage;
	}
	/**
	 * 求面积
	 * 
	 * @return
	 */
	public double getAcreage() {
		

		return acreage;
	}

	/**
	 * 获得周长
	 * 
	 * @return
	 */
	public double getPerimeter() {

		return perimeter ;
	}

	


}
