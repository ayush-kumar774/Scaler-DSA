package Lecture1IntroductionToProblemSolving.AdditionalProblems;

public class FindPerfectNumbers {
    public static int isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    sum += i ;
                }
                else {
                    sum += i ;
                    sum += (n / i) ;
                }
            }
        }
        if (sum == n) return 1 ;
        else return 0;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
/*
Problem Description
You are given an integer A. You have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.

A proper divisor of a natural number is the divisor that is strictly less than the number.



Problem Constraints
1 <= A <= 106



Input Format
First and only argument contains a single positive integer A.



Output Format
Return 1 if A is a perfect number and 0 otherwise.



Example Input
Input 1:

A = 4
Input 2:

A = 6


Example Output
Output 1:

0
Output 2:

1


Example Explanation
Explanation 1:

For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
Explanation 2:

For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
 */