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
