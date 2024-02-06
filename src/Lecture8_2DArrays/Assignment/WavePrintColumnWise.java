package Lecture8_2DArrays.Assignment;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int col = 0 ; col < n ; col++) {
            if (col % 2 == 0) {
                for (int row = 0 ; row < n; row ++) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            else {
                for (int row = (n - 1) ; row >= 0 ; row--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
        }
    }
}
