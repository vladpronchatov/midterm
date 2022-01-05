package string.problems;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        String s1 = "Shape";
        String s2 = "Phase";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(s1 + " and " + s2 + " are an anagram.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not an anagram.");
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not an anagram.");

        }
    }
}

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
