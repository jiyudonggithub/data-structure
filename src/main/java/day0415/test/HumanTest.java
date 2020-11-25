package day0415.test;

import day0415.entity.Human;
import day0415.entity.Man;
import day0415.entity.Wonmen;

public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Man();
		Human h2 = new Wonmen();
		test(h2);
		test(h1);
	}

	public static void test(Human h) {
		if (h == null) {
			return;
		}
		if (h instanceof Man) {
			((Man) h).dirve();
		} else if (h instanceof Wonmen) {
			((Wonmen) h).saJiao();
		} else {
			h.sleep();
		}

	}

}
