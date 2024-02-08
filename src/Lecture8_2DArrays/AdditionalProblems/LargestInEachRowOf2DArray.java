package Lecture8_2DArrays.AdditionalProblems;

import java.util.Scanner;

public class LargestInEachRowOf2DArray {
    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] ans = new int[n];
        for (int row = 0 ; row < n ; row++) {
            int max = Integer.MIN_VALUE;
            for (int col = 0 ; col < m ; col++) {
                max = Math.max(max, A[row][col]);
            }
            ans[row] = max;
        }
        return  ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0 ;i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[] ans = solve(mat);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
