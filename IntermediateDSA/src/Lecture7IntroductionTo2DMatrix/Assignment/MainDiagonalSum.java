package Lecture7IntroductionTo2DMatrix.Assignment;

public class MainDiagonalSum {
    public static int diagonalSum(final int[][] A) {
        int diagonalSum = 0 ;
        int row = 0;
        int col = 0 ;
        while (row < A.length) {
            diagonalSum += A[row][col];
            row++;
            col++;
        }
        return diagonalSum;
    }
}
