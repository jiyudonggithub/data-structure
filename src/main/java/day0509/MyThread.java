package day0509;

public class MyThread implements Runnable{
	private String name;
	
	public MyThread(String name) {
		super();
		this.name = name;
	}
	

	public MyThread() {
		super();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (MyThread.class) {
			for (int i = 0; i < 20; i++) {
				System.out.println("我是"+name+"线程"+i);
			}
		}
	}

}
