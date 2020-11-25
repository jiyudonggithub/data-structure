package day0412.entity;

public class Ostrich extends Brid {
	public int hight;
	public double speed;

	public Ostrich() {
		super();
	}

	public Ostrich(int wing, int log, int hight, double speed) {
		super(wing, log);
		this.hight = hight;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Ostrich [hight=" + hight + ", speed=" + speed + ", Wing=" + Wing + ", log=" + log + "]";
	}
	

}
