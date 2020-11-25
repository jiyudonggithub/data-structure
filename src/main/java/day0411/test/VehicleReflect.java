package day0411.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import day0411.entity.Vehicle;

@SuppressWarnings("all")
public class VehicleReflect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class forName = Class.forName("day0411.entity.Vehicle");
		System.out.println(forName);
		//构造该类的对象
		Vehicle vehicle = (Vehicle) forName.newInstance();
		//获得该类字段
		Field name1 = forName.getDeclaredField("speed");
		Field name2 = forName.getDeclaredField("distance");
		//暴力破解
//		name1.setAccessible(true);
//		name2.setAccessible(true);
		name1.set(vehicle, 15);
		name2.set(vehicle, 20);
		Method move = forName.getDeclaredMethod("move", int.class);
//		move.setAccessible(true);
		move.invoke(vehicle, 5);
		System.out.println(vehicle.getSpeed());
		vehicle.move(6);
	}
}
