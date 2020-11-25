package day0416.test;

import day0416.entity.Computer;
import day0416.entity.Printer;
import day0416.interfaces.USB;

public class UsbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USB cUsb = new Computer();
		USB pUsb = new Printer();
		cUsb.join();
		pUsb.join();

	}

}
