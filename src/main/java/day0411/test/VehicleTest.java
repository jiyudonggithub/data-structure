package day0411.test;

import day0411.entity.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle(30, 60);
		vehicle.setSpeed(50);
		vehicle.speedUp();
		vehicle.move(30);
		vehicle.speedDown();

	}

}
