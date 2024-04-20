package Lecture4ArraysPrefixSum.Assignment;

public class RangeSumQuery {
    public static long[] getPrefixSum(int[] A) {
        long[] prefixSum = new long[A.length];
        prefixSum[0] = A[0];
        for (int i = 1 ; i < A.length ; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        return prefixSum;
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        long[] rangeSum = new long[B.length];
        long[] prefixSum = getPrefixSum(A);
        for (int i = 0 ; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if (start == 0) {
                rangeSum[i] = prefixSum[end];
            }
            else {
                rangeSum[i] = prefixSum[end] - prefixSum[start - 1] ;
            }
        }
        return rangeSum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {
                {0, 3},
                {1, 2}
        };
        long[] longSum = rangeSum(A, B);
        for (long sum : longSum) {
            System.out.print(sum + " ");
        }
    }
}
/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.



Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
0 <= L <= R < N


Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.


Output Format
Return an integer array of length M where ith element is the answer for ith query in B.


Example Input
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Input 2:

A = [2, 2, 2]
B = [[0, 0], [1, 2]]


Example Output
Output 1:
[10, 5]
Output 2:

[2, 4]


Example Explanation
Explanation 1:
The sum of all elements of A[0 ... 3] = 1 + 2 + 3 + 4 = 10.
The sum of all elements of A[1 ... 2] = 2 + 3 = 5.
Explanation 2:

The sum of all elements of A[0 ... 0] = 2 = 2.
The sum of all elements of A[1 ... 2] = 2 + 2 = 4.
 */