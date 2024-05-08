package Lecture6Recursion1.AdditionalProblems;

public class CheckPalindrome {
    public static int checkPalindrome(String A, int start, int end) {
        if (start >= end) {
            return 1 ;
        }
        if (A.charAt(start) != A.charAt(end)) {
            return 0 ;
        }
        else return checkPalindrome(A, start + 1, end - 1);
    }

    public static int solve(String A) {
        return (checkPalindrome(A, 0, A.length() - 1));
    }

    public static void main(String[] args) {
        String A = "strings";
        String B = "naman";
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
