package day0507.test;

import java.io.Serializable;

public class EmpList implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8304211976967142504L;
	private String nameString;
	private String sex;
	private Integer year;
	
	public EmpList() {
		super();
	}

	public EmpList(String nameString, String sex, Integer year) {
		super();
		this.nameString = nameString;
		this.sex = sex;
		this.year = year;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "EmpList [nameString=" + nameString + ", sex=" + sex + ", year=" + year + "]";
	}
	
	

}
