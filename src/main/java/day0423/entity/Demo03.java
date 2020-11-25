package day0423.entity;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		namsadde("01#张三#20-02#李四#40-03#王五#60-04#赵六#80");
	}
	private static void namsadde(String str) {
		 int i = 0;
		 int star = 0;
		 int last = str.indexOf('-');
		 String[] s = new String[str.length()];
		 while (star<last) {
			 s[i] = str.substring(star,last);
			 System.out.println(s[i]);
			 star = str.indexOf('-', last)+1;
			 last = str.indexOf('-', star);
			i++;	
		}
	}
}
