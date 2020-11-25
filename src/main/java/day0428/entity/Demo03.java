package day0428.entity;

import java.util.LinkedList;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> list2 = list.subList(1, 4);
		LinkedList<Integer> list3 = new LinkedList<Integer>(list2);
		System.out.println(list2);
		list2.remove(1);
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list3);
		Integer[] array = list.toArray(new Integer[] {});
		for (Integer integer : array) {
			System.out.println(integer);
		}

	}

}
