package day0412.test;

import day0412.entity.Rectangle;
import day0412.entity.Shape;
import day0412.entity.Triangle;

public class ShapeTest {

	public static void main(String[] args) {

		Shape trishape = new Triangle(3, 4, 5);
		trishape.acreage = trishape.getAcreage();
		trishape.perimeter = trishape.getPerimeter();
		System.out.println("三角形面积" + trishape.acreage);
		System.out.println("三角形周长" + trishape.perimeter);
		Shape recshape = new Rectangle(4, 5);
		recshape.acreage = recshape.getAcreage();
		recshape.perimeter = recshape.getPerimeter();
		System.out.println("矩形面积" + recshape.acreage);
		System.out.println("矩形周长" + recshape.perimeter);

	}

}
