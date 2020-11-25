package day0417.test;

import day0417.interfaces.Usb;

public class UsbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usb usb = new Usb() {
			
			@Override
			public void dataTransform() {
				// TODO Auto-generated method stub
				System.out.println("传输数据");
			}
		};
		usb.dataTransform();
		Usb u = ()->{
			System.out.println("传输数据");
		};
		u.dataTransform();
	}

}
