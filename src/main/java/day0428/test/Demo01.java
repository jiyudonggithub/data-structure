package day0428.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			alist.add((i + 1));
		}
		System.out.println(alist);
		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i) % 3 == 0) {
				alist.remove(i);
			}
		}
		System.out.println(alist);

		Iterator<Integer> iterator = alist.iterator();
		Integer integer = null;
		while (iterator.hasNext()) {
			integer = (Integer) iterator.next();
			if (integer % 2 == 0) {
				iterator.remove();
			}

		}
		System.out.println(alist);
		for (Iterator iterator2 = alist.iterator(); iterator2.hasNext();) {
			Integer integer3 = (Integer) iterator2.next();
			if (integer3 % 5 == 0) {
				iterator2.remove();
			}
		}
		System.out.println(alist);
		for (Integer integer4 : alist) {
			System.out.println(integer4);
		}
		
	}

}
