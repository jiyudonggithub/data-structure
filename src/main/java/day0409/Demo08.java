package day0409;

public class Demo08 {

	public static void main(String[] args) {
		long sum = 0;
		String string="";
		for (int i = 0; i < 10; i++) {
			sum += Math.pow(10, i+1)-1;
			if (i<9) {
				string =string+(long)(Math.pow(10, i+1)-1)+"+";
			}else {
				string =string+(long)(Math.pow(10, i+1)-1);
			}
			
		}
		System.out.print(string+"=");
		System.out.println(sum);

	}

}
