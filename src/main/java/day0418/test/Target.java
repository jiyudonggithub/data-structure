package day0418.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day0418.entity.A;

@SuppressWarnings("all")
public class Target {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 方法一：通过对象的calss获得calss
		 */
		Class class1 = A.class;
		/**
		 * 方法二
		 */
		A a = new A();
		Class class2 = a.getClass();

		Class class3 = Class.forName("com.oak.entity.A");

		System.out.println(class1);
		System.out.println(class2);
		System.out.println(class3);
		System.out.println("=======");
		Constructor c1 = class3.getConstructor();

		A a2 = (A) c1.newInstance();
		System.out.println(a2);
		System.out.println("=======");
		A aa = (A) class2.newInstance();
		System.out.println(aa);
		System.out.println("=======");

		Constructor c2 = class3.getConstructor(String.class, int.class, String.class);

		A a3 = (A) c2.newInstance("万个无", 19, "男");

		System.out.println(a3);
		System.out.println("=======");
		/**
		 * 获取非public的构造方法
		 */
		Constructor c3 = class3.getDeclaredConstructor(int.class, String.class);
		/**
		 * 强行获得权限
		 */
		c3.setAccessible(true);

		A a4 = (A) c3.newInstance(20, "女");

		System.out.println(a4);
		System.out.println("=======");
		
		Field[] fields = class3.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field);
		}
		fields[0].set(a4, "赵柳");
		System.out.println(a4);
		Field field = class3.getDeclaredField("age");
		field.setAccessible(true);
		field.set(a4, 18);
		System.out.println(a4);

		Method slep = class3.getMethod("slep");
		
		slep.invoke(a4);
		Method tt = class3.getDeclaredMethod("tt");
		tt.setAccessible(true);
		tt.invoke(a4);
	}

}
