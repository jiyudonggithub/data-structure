package day0507.entity;

import java.io.Serializable;
import java.util.HashMap;

public class Emp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6257005485934781371L;
	/**
	 * 
	 */
	
	
	private HashMap<String, String> map;

	public Emp(HashMap<String, String> map) {
		super();
		this.map = map;
	}

	public Emp() {
		super();
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
}
