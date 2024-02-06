package Lecture8_2DArrays.Assignment;

import java.util.Scanner;

public class WavePrintRowWise {
    private static void waveMatrix(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0 ; i < row ; i++ ){
            if (i % 2 == 0)
            {
                for( int j = 0 ; j < col ; j++ ){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for( int j = col-1 ; j >= 0 ; j-- ){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        waveMatrix(mat);
    }
}
