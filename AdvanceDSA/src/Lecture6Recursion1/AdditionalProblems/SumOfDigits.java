package Lecture6Recursion1.AdditionalProblems;

public class SumOfDigits {

    public static int solve(int N) {
        if (N == 0)
        {
            return 0;
        }
        else {
            return (N % 10) + solve(N / 10);
        }
    }

    public static void main(String[] args) {
        int n1 = 46 ;
        int n2 = 11 ;
        System.out.println(solve(n1));
        System.out.println(solve(n2));
    }
}
