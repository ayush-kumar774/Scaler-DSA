package Lecture5BitManipulation2.AdditionalProblems;

public class SumOfXOROfAllPairs {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3};
        int[] A2 = {3, 4, 2};

        System.out.println(sumOfXorOfAllPairs(A1));
        System.out.println(sumOfXorOfAllPairs(A2));
    }

    private static int sumOfXorOfAllPairs(int[] A) {
        long mod = 1000000007;
        int n = A.length;
        long result = 0;

        int maxBit = 0;
        for (int num : A) {
            maxBit = Math.max(maxBit, Integer.toBinaryString(num).length());
        }

        for (int i = 0; i < maxBit; i++) {
            long countOnes = 0;
            for (int num : A) {
                if (((num >> i) & 1) == 1) {
                    countOnes++;
                }
            }
            result += (countOnes * (n - countOnes) * (1L << i)) % mod;
            result %= mod;
        }

        return (int) result;
    }
}
/*
Problem Description
Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.

Since the answer can be large, return the remainder after the dividing the answer by 109+7.



Problem Constraints
1 <= N <= 105

1 <= A[i] < 109



Input Format
Only argument A is an array of integers



Output Format
Return an integer denoting the sum of xor of all pairs of number in the array.



Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [3, 4, 2]


Example Output
Output 1:
6
Output 2:
14


Example Explanation
For Input 1:
Pair    Xor
{1, 2}  3
{1, 3}  2
{2, 3}  1
Sum of xor of all pairs = 3 + 2 + 1 = 6.
For Input 2:
Pair    Xor
{3, 4}  7
{3, 2}  1
{4, 2}  6
Sum of xor of all pairs = 7 + 1 + 6 = 14.
 */