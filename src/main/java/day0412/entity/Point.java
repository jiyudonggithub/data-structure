package day0412.entity;

public class Point {
	protected int x;
	protected int y;

	
	public Point() {
		super();
	}
	

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
