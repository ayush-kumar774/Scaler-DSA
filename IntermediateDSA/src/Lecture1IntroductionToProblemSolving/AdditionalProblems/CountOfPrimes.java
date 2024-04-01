package Lecture1IntroductionToProblemSolving.AdditionalProblems;

import static java.lang.Math.sqrt;

public class CountOfPrimes {
    private static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (int i = 2 ; i <= sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }
        return true ;
    }
    public static int solve(int A) {
        int ans = 0 ;
        for (int i = 2 ; i <= A ; i++) {
            if (isPrime(i)) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve(19));
    }
}
