package day0509;


public class Demo01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread("t1"));
		Thread t2 = new Thread(new MyThread("t2"));
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("我是线程"+i);
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("我是main线程"+i);
		}
	}

}
