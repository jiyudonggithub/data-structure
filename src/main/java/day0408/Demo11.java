package day0408;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void Bubbling(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			}
		}

	}

	public static void reverSeorder(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] < array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			}
		}

	}

	public static double averageValue(int[] arrays) {
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum += arrays[i];
		}
		double aver = sum * 1.0 / arrays.length;
		return aver;

	}

	public static String ArraysToString(int[] arrays) {
		String string = "{";
		for (int i = 0; i < arrays.length; i++) {
			if (i == arrays.length - 1) {
				string += "}";
			}
			string += "&";
		}
		return string;

	}
}
