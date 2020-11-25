package day0428.entity;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo02 {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		LinkedList<Integer> bList = new LinkedList<Integer>();
		long times = 100000L;
		for (int i = 0; i < times; i++) {
			aList.add(i);
			bList.add(i);
		}
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			aList.add(0, i);
		}

		long t2 = System.currentTimeMillis();
		System.out.println("ArrayList的执行时间:" + (t2 - t1));
		long t3 = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			bList.add(0, i);
		}
		long t4 = System.currentTimeMillis();
		System.out.println("ArrayList的执行时间:" + (t4 - t3));
	}

}
