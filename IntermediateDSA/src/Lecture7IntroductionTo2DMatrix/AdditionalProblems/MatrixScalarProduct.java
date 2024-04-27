package Lecture7IntroductionTo2DMatrix.AdditionalProblems;

import static Lecture5ArraysCarryForwardAndSubarrays.ArraysCarryForwardAndSubArrays.print2DArray;

public class MatrixScalarProduct {
    public static int[][] solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;

        for (int row = 0 ; row < n ; row++) {
            for (int col = 0 ; col < m ; col++) {
                A[row][col] *= B ;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        int[][]  A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int B = 2;
        int[][] ans = solve(A, B);
        print2DArray(ans);
    }

}
/*
Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.


Problem Constraints
1 <= A.size() <= 1000

1 <= A[i].size() <= 1000

1 <= A[i][j] <= 1000

1 <= B <= 1000



Input Format
First argument is 2D array of integers A representing matrix.

Second argument is an integer B.



Output Format
You have to return a 2D array of integers after doing required operations.



Example Input
Input 1:

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = 2
Input 2:
A = [[1]]
B = 5


Example Output
Output 1:
[[2, 4, 6],
[8, 10, 12],
[14, 16, 18]]
Output 2:
[[5]]


Example Explanation
Explanation 1:
==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2

==> [[2*1, 2*2, 2*3],
     [2*4, 2*5, 2*6],
     [2*7, 2*8, 2*9]]

==> [[2,   4,  6],
     [8,  10, 12],
     [14, 16, 18]]
Explanation 2:
==> ( [[1]] ) * 5

==> [[5*1]]

==> [[5]]
 */