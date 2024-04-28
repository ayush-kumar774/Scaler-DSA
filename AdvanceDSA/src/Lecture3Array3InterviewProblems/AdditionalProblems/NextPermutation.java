package Lecture3Array3InterviewProblems.AdditionalProblems;

public class NextPermutation {
    public static void main(String[] args) {

    }
}
/*
Problem Description
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

If such an arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:

The replacement must be in place, do not allocate extra memory.
DO NOT USE LIBRARY FUNCTION FOR the NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.


Problem Constraints
1 <= N <= 5 * 105

1 <= A[i] <= 109



Input Format
The first and the only argument of input has an array of integers, A.



Output Format

Return an array of integers, representing the next permutation of the given array.



Example Input

Input 1:
A = [1, 2, 3]

Input 2:
A = [3, 2, 1]


Example Output

Output 1:
[1, 3, 2]

Output 2:
[1, 2, 3]


Example Explanation

Explanation 1:
Next permutation of [1, 2, 3] will be [1, 3, 2].
Explanation 2:

No arrangement is possible such that the number is arranged into the numerically next greater permutation of numbers.
So will rearrange it in the lowest possible order.
 */