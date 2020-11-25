package day0412.entity;

public class RegularHexagon extends Shape {
	public int a;

	public RegularHexagon(int a) {
		super();
		this.a = a;
	}

	@Override
	public double getAcreage() {
		// TODO Auto-generated method stub
		return 0.0721 * 36 * a * a;
	}

}
