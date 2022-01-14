package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new LinkedList<>();
		queue.poll();

		for(int i = 0; i <= 10; i++)
			queue.add(i);

		int qHead = queue.peek();
		System.out.println("Peeked " + qHead + " at head of queue.");

		int polled = queue.poll();
		System.out.println("Polled " + polled + " from head of queue.");

		int removed = queue.remove();
		System.out.println("Removed " + removed + " from head of queue.");

		System.out.println("For Each Loop Data: ");
		for (Integer in : queue) {
			System.out.println(in);
		}

		System.out.println("Iterator and While Loop Data: ");
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
		}
	}
}

