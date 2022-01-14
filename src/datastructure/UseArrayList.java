package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {


	/*
	 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
	 * Use For Each loop and while loop with Iterator to retrieve data.
	 * Store all the sorted data into one of the databases.
	 *
	 */
	public static void main(String[] args) throws Exception {


		ArrayList<String> computers = new ArrayList<>();
		computers.add("Apple");
		computers.add("Dell");
		computers.add("Lenovo");
		computers.add("HP");
		computers.add("Asus");

		System.out.println("Original Elements in ArrayList: " + computers);

		computers.add(1, "Acer");
		computers.add(3, "Alienware");


			System.out.println("ArrayList with more brands: " + computers);

			computers.remove("Dell");
			computers.remove(5);

			System.out.println("Final ArrayList after removing brands: " + computers);


			System.out.println("For Each Loop: ");
			for (String in : computers) {
				System.out.println(in);
			}


			System.out.println("While Loop: ");
			Iterator it = computers.iterator();
			while (it.hasNext()) {
				String i = (String) it.next();
				System.out.println(i);
			}

			Collections.sort(computers);
			for (String str : computers) {
				System.out.println(str);
			}
		}
	}



