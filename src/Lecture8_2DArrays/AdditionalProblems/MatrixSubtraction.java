package Lecture8_2DArrays.AdditionalProblems;

import java.util.Scanner;

public class MatrixSubtraction {
    public static int[][] solve(int[][]A, int[][]B) {
        int n = A.length;
        int m = A[0].length;
        int[][] ans = new int[n][m];
        for (int row = 0 ; row < n ; row++) {
            for (int col = 0 ; col < m ; col++) {
                ans[row][col] = (A[row][col] - B[row][col]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] mat2 = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        int[][] ans = solve(mat, mat2);
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
