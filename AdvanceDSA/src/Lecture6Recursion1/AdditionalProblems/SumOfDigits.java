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
/*
Problem Description
Given a number A, we need to find the sum of its digits using recursion.


Problem Constraints
1 <= A <= 109


Input Format
The first and only argument is an integer A.


Output Format
Return an integer denoting the sum of digits of the number A.


Example Input
Input 1:

 A = 46
Input 2:

 A = 11


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 Sum of digits of 46 = 4 + 6 = 10
Explanation 2:

 Sum of digits of 11 = 1 + 1 = 2
 */