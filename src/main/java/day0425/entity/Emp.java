package day0425.entity;

public class Emp {
	private String name;
	private int year;
	private int sollyer;
	private String gener;

	public Emp(String name, int year, int sollyer, String gener) {
		super();
		this.name = name;
		this.year = year;
		this.sollyer = sollyer;
		this.gener = gener;
	}

	public Emp() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSollyer() {
		return sollyer;
	}

	public void setSollyer(int sollyer) {
		this.sollyer = sollyer;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+","+this.year+","+this.gener+","+this.sollyer+".";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}else {
			return obj.equals(this.name);
		}
	}
}
