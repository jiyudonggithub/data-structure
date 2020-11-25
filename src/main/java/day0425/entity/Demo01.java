package day0425.entity;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ssd 55,1".replaceFirst("\\s", "#"));
		System.out.println(isIDCard("342221199510139218"));
		
	}
	private static boolean isIDCard(String str) {
		return str.matches("\\d{17,18}[X]?");
	}
 
}
