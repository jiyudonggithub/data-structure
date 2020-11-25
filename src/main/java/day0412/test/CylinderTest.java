package day0412.test;

import day0412.entity.Cylinder;

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cyliner = new Cylinder(2, 5, 3, 6);
		int x = cyliner.getX();
		int y = cyliner.getY();
		int r = cyliner.getR();
		double s = cyliner.getAcreage();
		double v = cyliner.getVolume();
		System.out.println("X:" + x + " Y:" + y);
		System.out.println("R:" + r);
		System.out.println("底面积" + s);
		System.out.println("圆柱体积" + v);

	}

}
