package math.problems;

public class FindLowestDifference {
    public static int[] findLowestDifference(int[] a, int[] b) {
        double lowestDiff = Double.MAX_VALUE;
        int[] lowestDiffPair = new int[2];

        for (int i : a) {
            for (int j : b) {
                int currentDiff = Math.abs(i - j);
                if (currentDiff < lowestDiff) {
                    lowestDiff = currentDiff;
                    lowestDiffPair[0] = i;
                    lowestDiffPair[1] = j;
                }
            }
        }
        return lowestDiffPair;
    }

    public static void main(String[] args) {
        int[] a = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        int[] b = new int[]{18, 25, 41, 47, 17, 36, 14, 19};
        int[] pair = findLowestDifference(a, b);
        System.out.println(pair[0] + " " + pair[1]);
    }
}

        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

