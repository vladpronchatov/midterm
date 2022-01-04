package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 40, firstNumber = 0, secondNumber = 1;
        System.out.print("First 40 Fibonacci numbers: ");

        for (int i = 1; i <= n; i++) {
            int nextNumber = firstNumber + secondNumber;

            System.out.print(firstNumber + ", ");

            firstNumber = secondNumber;
            secondNumber = nextNumber;


         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        }
    }
}
