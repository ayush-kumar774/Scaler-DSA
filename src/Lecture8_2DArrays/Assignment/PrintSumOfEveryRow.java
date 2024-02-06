package Lecture8_2DArrays.Assignment;

import java.util.Scanner;

public class PrintSumOfEveryRow {
    private static int[] rowSum(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[] sumRow = new int[row];
        for(int i = 0 ; i < row ; i++ ){
            int sum = 0 ;
            for(int j = 0 ; j < col ; j++ ){
                sum += arr[i][j];
            }
            sumRow[i] = sum;
        }
        return  sumRow;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        for(int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int[] ans = rowSum(array);
        for (int i = 0 ; i < ans.length ; i++ ){
            System.out.print(ans[i] + " ");
        }
    }
}
