package Lecture7IntroductionTo2DMatrix.Assignment;

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
}
