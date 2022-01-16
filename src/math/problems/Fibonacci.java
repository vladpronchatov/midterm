package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 40;
        int prev = 0;
        int next = 1;
        System.out.print("The first 40 Fibonacci numbers are: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(prev);
            next = next + prev;
            prev = next - prev;
        }
    }
}       /*
         Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
