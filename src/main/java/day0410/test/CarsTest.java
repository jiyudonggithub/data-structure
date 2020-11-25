package day0410.test;

import day0410.entity.Cars;

public class CarsTest {

	public static void main(String[] args) {
		Cars cars = new Cars();
		cars.brand = "凯迪拉克";
		cars.colour = "黑色";
		cars.num = 4;
		cars.move(0, 200);
		cars.getClass();
		cars.showMe();

	}

}
