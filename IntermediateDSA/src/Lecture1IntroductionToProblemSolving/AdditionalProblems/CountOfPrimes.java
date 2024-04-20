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
/*
Problem Description
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.


Problem Constraints
0 <= n <= 10^3


Input Format
Single input parameter n in function.


Output Format
Return the count of prime numbers less than or equal to n.


Example Input
Input 1:
19
Input 2:
1


Example Output
Output 1:
8
Output 2:
0


Example Explanation
Explanation 1:
Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
Explanation 2:
There are no primes <= 1
 */