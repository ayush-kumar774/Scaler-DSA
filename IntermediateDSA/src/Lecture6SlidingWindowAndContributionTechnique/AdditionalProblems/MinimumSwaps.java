package Lecture6SlidingWindowAndContributionTechnique.AdditionalProblems;

public class MinimumSwaps {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int countB = 0;
        for (int j : A) {
            if (j <= B) {
                countB++;
            }
        }
        int greaterB = 0;
        for (int i = 0; i < countB; i++) {
            if (A[i] > B) {
                greaterB++;
            }
        }

        int ans = greaterB;
        for (int i = 0, j = countB; j < n; i++, j++) {
            if (A[i] > B) {
                greaterB--;
            }
            if (A[j] > B) {
                greaterB++;
            }
            ans = Math.min(ans, greaterB);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 12, 10, 3, 14, 10, 5} ;
        int B = 8 ;
        System.out.println(solve(A, B));
    }
}
/*
Problem Description

Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.



Problem Constraints

1 <= length of the array <= 100000
-109 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return the minimum number of swaps.



Example Input

Input 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 B = 8
Input 2:

 A = [5, 17, 100, 11]
 B = 20


Example Output

Output 1:

 2
Output 2:

 1


Example Explanation

Explanation 1:

 A = [1, 12, 10, 3, 14, 10, 5]
 After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
 After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
 Now, all elements less than or equal to 8 are together.
Explanation 2:

 A = [5, 17, 100, 11]
 After swapping 100 and 11, A => [5, 17, 11, 100].
 Now, all elements less than or equal to 20 are together.
 */