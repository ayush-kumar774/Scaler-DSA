package Lecture7IntroductionTo2DMatrix.Assignment;

import static Lecture5ArraysCarryForwardAndSubarrays.ArraysCarryForwardAndSubArrays.print2DArray;

public class RotateMatrix {
    public static void solve (int[][] A) {
        int n = A.length;
        for(int row = 0 ; row < n ; row++) {
            for (int col = row ; col < n ; col++) {
                int temp = A[row][col];
                A[row][col] = A[col][row];
                A[col][row] = temp;
            }
        }

        for(int row = 0 ; row < n ; row++) {
            for (int col = 0 ; col < n / 2 ; col++) {
                int temp = A[row][col];
                A[row][col] = A[row][n - col - 1];
                A[row][n - col - 1] = temp;
            }
        }

    }

    public static void main(String[] args)  {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        solve(mat);
        print2DArray(mat);
    }
}
