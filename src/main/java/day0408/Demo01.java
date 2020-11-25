package day0408;

public class Demo01 {

	public static void main(String[] args) {
		int[] arrys = { 5, 6, 9, 8, 7, 1, 2, 3, 4 };
		String string = "{";
		for (int i = 0; i < arrys.length; i++) {
			if (i < arrys.length - 1) {
				string += arrys[i] + "-";
			} else {
				string += arrys[i] + "}";
			}
		}
		System.out.println(string);
	}

}
