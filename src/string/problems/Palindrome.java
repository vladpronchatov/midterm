package string.problems;

public class Palindrome {
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "Stats";
        if (isPalindrome(s))
            System.out.print(s + " is a palindrome.");
        else
            System.out.print(s + " is not a palindrome.");
    }
}


        /*
          If a String is reversed, and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */