package day0416.entity;

public class B extends A {
	// static {
	// System.out.println("我是B的静态代码块");
	// }
	//
	// {
	// System.out.println("我是B的构造代码块");
	// }

//	public B() {
//		System.out.println("我是B的无参构造");
//	}

	public static void st() {
		System.out.println("我是B的静态方法");
	}

	public void tt() {
		System.out.println("我是B的成员方法");
	}
}
