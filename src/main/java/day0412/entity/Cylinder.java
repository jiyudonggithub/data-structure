package day0412.entity;

public class Cylinder extends Circle {
	protected int h;

	public Cylinder() {
		super();
	}

	public Cylinder(int x, int y, int r, int h) {
		super(x, y, r);
		this.h = h;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getVolume() {
		return Math.PI * Math.pow(this.r, 2) * this.h;
	}

}
