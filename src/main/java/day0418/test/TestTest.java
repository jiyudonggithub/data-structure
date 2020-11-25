package day0418.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

import day0418.entity.A;
@SuppressWarnings("all")
public class TestTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ResourceBundle rBundle = ResourceBundle.getBundle("test");
		String className = rBundle.getString("className");
		String name = rBundle.getString("name");
		String age = rBundle.getString("age");
		String method = rBundle.getString("method");
		System.out.println(className);
		System.out.println(name);
		System.out.println(age);
		System.out.println(method);

		Class aclass = Class.forName(className);

		A a1 = (A) aclass.newInstance();

		Field name2 = aclass.getDeclaredField("name");

		Field age2 = aclass.getDeclaredField("age");
		name2.setAccessible(true);

		age2.setAccessible(true);
		
		name2.set(a1, name);
		
		age2.set(a1, Integer.parseInt(age));
		
		Method method2 = aclass.getDeclaredMethod(method, null);
		method2.setAccessible(true);
		
		method2.invoke(a1, null);
		

	}

}
