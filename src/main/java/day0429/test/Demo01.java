package day0429.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo01 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("aa");
		queue.offer("bb");
		queue.offer("cc");
		System.out.println(queue.peek());
		while (queue.size() > 0) {
			System.out.println(queue.poll());
		}
		System.out.println("=======================");
		Deque<String> deque = new LinkedList<String>();
		deque.push("aa");
		deque.push("bb");
		deque.push("cc");
		System.out.println(deque.peek());
		while (deque.size() > 0) {
			System.out.println(deque.pop());
		}

	}

}
