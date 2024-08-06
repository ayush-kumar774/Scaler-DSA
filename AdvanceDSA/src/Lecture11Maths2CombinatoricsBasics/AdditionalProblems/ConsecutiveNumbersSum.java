package Lecture11Maths2CombinatoricsBasics.AdditionalProblems;

public class ConsecutiveNumbersSum {
    public static void main(String[] args) {
        System.out.println(solve(5));
        System.out.println(solve(15));
    }
    public static int solve(int A) {
        int count = 0;
        int k = 1;

        while (k * (k - 1) < 2 * A) {
            if ((2 * A) % k == 0) {
                int x = (2 * A / k - k + 1) / 2;
                if ((2 * A / k - k + 1) % 2 == 0 && x > 0) {
                    count++;
                }
            }
            k++;
        }

        return count;
    }
}
/*
Problem Description
Given a positive integer A.

Return the number of ways it can be written as a sum of consecutive positive integers.



Problem Constraints
1 <= A <= 109



Input Format
The first and the only argument of input contains an integer, A.



Output Format
Return an integer, representing the answer as described in the problem statement.



Example Input

Input 1:
A = 5

Input 2:
A = 15


Example Output
Output 1:
2

Output 2:
4


Example Explanation

Explanation 1:
The 2 ways are:
 => [5]
 => [2, 3]

Explanation 2:
The 4 ways are:
 => [15]
 => [7, 8]
 => [4, 5, 6]
 => [1, 2, 3, 4, 5]
 */
