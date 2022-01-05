package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
        String s = "ABC";
        int n = s.length();
        Permutation permutation = new Permutation();
        permutation.permute(s, 0, n - 1);
    }

    private void permute(String s, int i, int j) {
        if (i == j)
            System.out.println(s);
        else {
            for (int k = i; k <= j; k++) {
                s = swap(s, i, k);
                permute(s, i + 1, j);
                s = swap(s, i, k);
            }

        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

    /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
