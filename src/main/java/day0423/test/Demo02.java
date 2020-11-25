package day0423.test;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(temp("Me Love You", "I love China"));
	}

	public static String temp(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String[] split1 = s1.split(" ");
		String[] split2 = s2.split(" ");
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < split1.length; i++) {
			for (int j = 0; j < split2.length; j++) {
				if (split1[i].equals(split2[j])) {
					sBuffer.append(split1[i]);
				}
			}
		}
		return sBuffer.toString();
	}
}
