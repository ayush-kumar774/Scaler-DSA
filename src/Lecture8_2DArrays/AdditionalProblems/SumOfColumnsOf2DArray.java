package Lecture8_2DArrays.AdditionalProblems;

import java.util.Scanner;

public class SumOfColumnsOf2DArray {
    public static int[] solve(int A , int B , int[][] C) {
        int[] ans = new int[B];
        for (int col = 0 ; col < B ; col++) {
            int sum = 0 ;
            for (int row = 0 ; row < A ; row++) {
                sum += C[row][col];
            }
            ans[col] = sum;
        }
        return ans;
    }
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
        int[]ans = solve(n, m, mat);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
