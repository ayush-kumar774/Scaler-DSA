package Lecture8_2DArrays.AdditionalProblems;

import java.util.Scanner;

public class AreMatricesSame {
    public static int solve(int[][]A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int ans = 1 ;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (A[i][j] != B[i][j]) {
                    ans = 0 ;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] mat2 = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(mat, mat2));
    }
}
