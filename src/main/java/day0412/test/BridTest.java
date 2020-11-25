package day0412.test;

import day0412.entity.Brid;
import day0412.entity.Eagle;
import day0412.entity.Ostrich;
import day0412.entity.Sparrow;

public class BridTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brid sparrow = new Sparrow(2, 2, 3, 18.5);
		System.out.println(sparrow);
		Brid ostich = new Ostrich(2, 2, 2, 50);
		System.out.println(ostich);
		Brid eagle = new Eagle(2, 2, 3000, "兔子");
		System.out.println(eagle);
		

	}

}
