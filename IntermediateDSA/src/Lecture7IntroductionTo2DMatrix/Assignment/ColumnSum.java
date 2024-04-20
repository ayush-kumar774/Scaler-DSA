package Lecture7IntroductionTo2DMatrix.Assignment;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class ColumnSum {
    public static int[] columnSum(int[][] A) {
        int[] sum = new int[A[0].length];
        for (int col = 0 ; col < A[0].length; col++) {
            for (int row = 0 ; row < A.length; row++) {
                sum[col] += A[row][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4},
                {5,6,7,8},
                {9,2,3,4}
        };
        int[] columnSum = columnSum(A);
        printArray(columnSum);
    }
}
/*
Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.



Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument is a 2D array of integers.(2D matrix).



Output Format
Return an array containing column-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

{15,10,13,16}


Example Explanation
Explanation 1

Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
 */