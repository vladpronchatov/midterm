package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		System.out.println(textFile);
		FileReader fr = null;
		BufferedReader br = null;
		List<String> linkedList = new LinkedList<>();
		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}

		String a;
		Stack stack = new Stack();
		int count = 0;
		try {
			while ((a = br != null ? br.readLine() : null) != null) {
				System.out.println(a);
				String[] text = a.split(" ");
				for (String s : text) {
					stack.push(s);
					linkedList.add(s);
				}
			}
			System.out.println("Word count is " + count);
		} catch (IOException io) {
			io.printStackTrace();
		}

		System.out.println();
		for (String s : linkedList) {
			System.out.println("FIFO order from LinkedList = " + s);
		}

		System.out.println();
		for (int i = stack.size() - 1; i >= 0; i--) {
			System.out.println("FILO order from stack = " + stack.get(i));
		}


		System.out.println("Peek stack: " + stack.peek());
		System.out.println("Search stack: " + stack.search("steps!"));
		System.out.println("Pop stack: " + stack.pop());


		System.out.println("Retrieving data using for-each loop: ");
		for (Object st : stack) {
			System.out.println(st);
		}

		System.out.println("Retrieving data using while loop: ");
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}

		System.out.println("Retrieving data using iterator: ");
		for (String obj : linkedList) {
			System.out.println(obj);
		}
	}
}
