package day0510.test;

public class Demo02 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Demo01());
		thread.start();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Demo01 .flag = false;
		
	}

}
