package day0423.test;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "To be or not to be";
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			  StringBuffer sBuffer = new StringBuffer(split[i]);
			  sBuffer.reverse();
			 split[i] = sBuffer.toString();
		}
		 StringBuffer sBuf = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			sBuf.append(split[i]+" ");
			if (i == split.length-1) {
				sBuf.append(split[i]);
			}
		}
		System.out.println(sBuf.toString());
		System.out.println("========================");
		String[] split1 = new String[6];
		split1[0] = "czx";
		split1[1] = "adasd";
		for (int i = 0; i < split1.length; i++) {
			
		}
		String ss = String.valueOf(split1);
		System.out.println(ss);
		 StringBuffer sBuffer = new StringBuffer(ss);
		 sBuf.trimToSize();
		 System.out.println(sBuffer.toString());
		
	}

}
