package day0412.test;

import day0412.entity.Car;
import day0412.entity.Truck;
import day0412.entity.Vehicle;

public class VehicleTes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Car(4, 2.0, 4);
		System.out.println(vehicle);
		Vehicle truck = new Truck(12, 5.6, 2, 4.5);
		System.out.println(truck);

	}

}
