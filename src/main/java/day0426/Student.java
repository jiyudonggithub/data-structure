package day0426;

public class Student {
	private String name;
	private String card;
	private int score;
	private int year;

	public Student() {
		super();
	}

	public Student(String name, String card, int score, int year) {
		super();
		this.name = name;
		this.card = card;
		this.score = score;
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "," + this.card + "," + this.score + "," + this.year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		} else {
			return obj.equals(this.card);
		}
	}

}
