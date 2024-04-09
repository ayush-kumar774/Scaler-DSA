package Lecture7IntroductionTo2DMatrix.Assignment;

import static Lecture5ArraysCarryForwardAndSubarrays.ArraysCarryForwardAndSubArrays.print2DArray;

public class MatrixTranspose {
    public static int[][] matrixTranspose (int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] matrix = new int[m][n];
        for (int col = 0; col < m; col++) {
            for (int row = 0 ; row < n ; row++) {
                matrix[col][row] = A[row][col];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        print2DArray(matrixTranspose(mat));
    }
}
