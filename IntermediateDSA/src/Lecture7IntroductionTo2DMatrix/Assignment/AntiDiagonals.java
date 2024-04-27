package Lecture7IntroductionTo2DMatrix.Assignment;

import static Lecture5ArraysCarryForwardAndSubarrays.ArraysCarryForwardAndSubArrays.print2DArray;

public class AntiDiagonals {
    public static int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] ans = new int[(2 * n) - 1][n];
        int row = 0 ;
        int index = 0;
        for (int col = 0 ; col < n ; col++) {
            int i = row;
            int j = col;
            int[] temp = new int[n];
            int index2 = 0 ;
            while (i < n && j >=0) {
                temp[index2] = A[i][j];
                i++;
                j--;
                index2++;
            }
            ans[index] = temp;
            index++;
        }
        int col = n - 1;
        for (row = 1 ; row < n ; row++) {
            int i = row ;
            int j = col ;
            int[] temp = new int[n];
            int index2 = 0 ;
            while(i < n && j >= 0) {
                temp[index2] = A[i][j];
                i++;
                j--;
                index2++;
            }
            ans[index] = temp;
            index++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] B = printDiagonalsSimplified(A);
        A = diagonal(A);
        print2DArray(A);
        System.out.println();
        print2DArray(B);
    }

    public static int[][] printDiagonalsSimplified(int[][] A) {
        int n = A.length;
        int[][] ans = new int[(2 * n) - 1][n];
        int index = 0 ;

        // Upper half including the main diagonal
        for (int col = 0 ; col < n ; col++) {
//            int size = col + 1 ;
            int[] temp = new int[n];

            for (int i = 0 ; i <= col ; i++) {
                temp[i] = A[i][col - i];
            }
            ans[index++] = temp;
        }

        // Lower half from the main diagonal
        for(int row = 1 ; row < n ; row++) {
            int size = n - row ;
            int[] temp = new int[n];

            for (int i = 0 ; i < size ; i++) {
                temp[i] = A[row + i][n - 1 - i];
            }
            ans[index++] = temp;
        }

        return ans;
    }
}
/*
Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.


Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9


Input Format
Only argument is a 2D array A of size N * N.


Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.


Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:

1 2
3 4


Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:

1 0
2 3
4 0


Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:

The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].

 */