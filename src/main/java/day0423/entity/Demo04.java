package day0423.entity;

public class Demo04 {
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer(50);
		sBuffer.append("sadasdsa");
		System.out.println(sBuffer);
		System.out.println("+++++++++++++++++++");
		sBuffer.insert(6, "123456");
		System.out.println(sBuffer);
		System.out.println(sBuffer.capacity());
		System.out.println("+++++++++++++++++++");
		String substring = sBuffer.substring(5);
		System.out.println(substring);
		System.out.println(sBuffer.capacity());
		System.out.println("+++++++++++++++++++");
		sBuffer.trimToSize();
		System.out.println(sBuffer.capacity());
		System.out.println("+++++++++++++++++++");
		System.out.println(sBuffer.delete(3, 6));
		sBuffer.trimToSize();
		System.out.println(sBuffer.capacity());
		System.out.println("+++++++++++++++++++");
		
		
	}

}
