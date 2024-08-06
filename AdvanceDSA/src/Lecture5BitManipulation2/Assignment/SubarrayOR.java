package Lecture5BitManipulation2.Assignment;

public class SubarrayOR {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[] A2 = {7, 8, 9, 10};

        System.out.println(subarrayOR(A1));
        System.out.println(subarrayOR(A2));
    }
    private static int subarrayOR(int[] A) {
        final int MOD = 1000000007;
        int N = A.length;
        long result = 0;

        for (int bit = 0; bit < 32; bit++) {
            long total = 0;
            long count = 0;
            for (int i = 0; i < N; i++) {
                if ((A[i] & (1 << bit)) == 0) {
                    count++;
                } else {
                    total += (count * (count + 1)) / 2;
                    count = 0;
                }
            }
            total += (count * (count + 1)) / 2;

            long subarraysWithBitSet = (long) N * (N + 1) / 2 - total;
            result = (result + subarraysWithBitSet * (1L << bit) % MOD) % MOD;
        }

        return (int) result;
    }
}
/*
Problem Description
You are given an array of integers A of size N.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of A % 109 + 7.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 108



Input Format
The first argument given is the integer array A.



Output Format
Return the sum of Value of all subarrays of A % 109 + 7.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [7, 8, 9, 10]


Example Output
Output 1:

 71
Output 2:

 110


Example Explanation
Explanation 1:

 Value([1]) = 1
 Value([1, 2]) = 3
 Value([1, 2, 3]) = 3
 Value([1, 2, 3, 4]) = 7
 Value([1, 2, 3, 4, 5]) = 7
 Value([2]) = 2
 Value([2, 3]) = 3
 Value([2, 3, 4]) = 7
 Value([2, 3, 4, 5]) = 7
 Value([3]) = 3
 Value([3, 4]) = 7
 Value([3, 4, 5]) = 7
 Value([4]) = 4
 Value([4, 5]) = 5
 Value([5]) = 5
 Sum of all these values = 71
Explanation 2:

 Sum of value of all subarray is 110.
 */