package day0426;

public class Demo01 {

	public static void main(String[] args) {
		Integer a = new Integer(50);
		Integer b = new Integer("56458");
		System.out.println(a);
		System.out.println(b);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(a.compareTo(b));
		System.out.println(a.equals(b));
		System.out.println(a.intValue());
		System.out.println(b.intValue());
		/**
		 * 装箱
		 */
		Integer valueOf = Integer.valueOf(5);
		/**
		 * 拆箱
		 */
		int intValue = valueOf.intValue();
		System.out.println(intValue);
		
		Integer i9 = 10;
		i9 += 15;
		System.out.println(i9++);
		System.out.println(i9);
		
	}

}
