package Lecture8_2DArrays.Assignment;

import java.util.Scanner;

public class AddTheMatrices {
    public static int[][] addTheMatrix (int[][] A, int[][]B) {
        int n = A.length;
        int[][] sum = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                sum[i][j] = (A[i][j] + B[i][j]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][]sum = addTheMatrix(A, B);
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(sum[i][j] + " ");;
            }
            System.out.println();
        }

    }
}
