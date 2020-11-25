package day0412.entity;

public class Eagle extends Brid {
	public int height;
	public String food;

	public Eagle() {
		super();
	}

	public Eagle(int wing, int log, int height, String food) {
		super(wing, log);
		this.height = height;
		this.food = food;
	}

	@Override
	public String toString() {
		return "Eagle [height=" + height + ", food=" + food + ", Wing=" + Wing + ", log=" + log + "]";
	}
	

}
