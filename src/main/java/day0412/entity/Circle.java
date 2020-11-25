package day0412.entity;

public class Circle extends Point {
	protected int r;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;

	}

	public double getAcreage() {
		return Math.PI * Math.pow(this.r, 2);
	}

}
