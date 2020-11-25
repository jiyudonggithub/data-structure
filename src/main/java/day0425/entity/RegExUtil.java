package day0425.entity;

public class RegExUtil {
	
	public  boolean isCard(String str) {
		return str.matches("1[3-9]\\d{9}");
	}

	public  boolean isIDCard(String str) {
		// 342221 1995 1013 9218
		return str.matches("\\d{6}[12][0-9]{3}[01][1-9][0-3][0-9]{5}");
	}

	public  boolean isYouB(String str) {
		return str.matches("\\d{6}");
	}
	public  boolean isEmial(String str) {
		if (str == null) {
			return false;
		}else{
			return str.matches("[a-zA-Z]{3,9}@[a-zA-Z]{2,4}\\.com(\\.cn)?");
		}
	}

}
