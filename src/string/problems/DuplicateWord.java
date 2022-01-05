package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also, Find the average length of the words.
         */

        String string = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count;
        string = string.toLowerCase();
        String[] word = string.split(" ");

        System.out.println("Duplicate words: ");
        for (int i = 0; i < word.length; i++) {
            count = 1;
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                    word[j] = "0";

                }
            }
            if (count > 1 && !word[i].equals("0"))
                System.out.println(word[i]);

        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double sum = 0;
        double av;
        int letterCount = 0;
        String[] c = s.split(" ");
        for (String words : c) {
            int wordsLength = words.length();
            sum = sum + wordsLength;
            letterCount++;
        }
        av = Math.round(sum / letterCount);
        System.out.println(av);
    }
}

