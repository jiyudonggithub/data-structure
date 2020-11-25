package day0412.test;

/*package day0412.entity.test;

import day0412.entity.entity.A;
import day0412.entity.entity.B;
import day0412.entity.entity.C;

public class C1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A c1 =new C();
		B c2 =new C();
		C c3 =new C();
		c1.a1();
		c1.a2();
		c2.a1();
		c3.a1();
	}

}
*/
class Fu {
	public int num = 100;

	public void show() {
		System.out.println("show Fu");
	}

	public static void function() {
		System.out.println("function Fu");
	}
}

class Zi extends Fu {
	public int num = 1000;
	public int num2 = 200;

	public void show() {
		System.out.println("show Zi");
	}

	public void method() {
		System.out.println("method zi");
	}

	public static void function() {
		System.out.println("function Zi");
	}
}

public class C1Test {
	public static void main(String[] args) {

		Fu f = new Zi();
		System.out.println(f.num);

		f.show();
	}
}
