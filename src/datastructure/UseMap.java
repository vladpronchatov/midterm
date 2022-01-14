package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(11, "Seattle");
		hmap.put(23, "New York");
		hmap.put(3, "Chicago");
		hmap.put(17, "Miami");
		hmap.put(9, "Austin");

		String var1 = hmap.get(11);
		System.out.println("Value at index 11 is: " + var1);
		String var2 = hmap.get(9);
		System.out.println("Value at index 9 is: " + var2);


		Map<String, List<String>> list = new HashMap<>();
		List<String> cars = new ArrayList<>();
		cars.add("Subaru");
		cars.add("Honda");
		cars.add("Ferrari");

		list.put("car", cars);
		System.out.println(list);

		System.out.println("For Loop: ");
		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}


		Iterator iterator = hmap.entrySet().iterator();
		System.out.println("While Loop: ");
		while (iterator.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterator.next();
			System.out.println("Key: " + me2.getKey() + " & Value: " + me2.getValue());
		}
	}
}
