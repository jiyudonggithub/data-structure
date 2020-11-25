package day0411.entity;

public class Vehicle {
	public int speed;
	public int distance;

	public Vehicle(int speeed, int distance) {
		super();
		this.speed = speeed;
		this.distance = distance;
	}

	public void move(int s) {
		this.distance = this.distance + s * this.speed;
		System.out.println("移动" + this.distance + "米");

	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getSpeed() {
		return speed;
	}

	public Vehicle() {
		super();
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("现将车速设置为" + this.speed + "米/秒");

	}

	public void speedUp() {
		this.speed += 20;
		System.out.println("现将车速加速为" + this.speed + "米/秒");
	}

	public void speedDown() {
		this.speed -= 20;
		System.out.println("现将车速降为" + this.speed + "米/秒");
	}

}
