package Lecture8_2DArrays.AdditionalProblems;

import java.util.Scanner;

public class PrintMatrixColumnByColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int col = 0 ; col < m ; col++) {
            for (int row = 0 ; row < n ; row++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }
}
