package Lecture7IntroductionTo2DMatrix;

import java.util.Scanner;

import static Lecture3IntroductionToArrays.Arrays.print2DArrays;
import static Lecture3IntroductionToArrays.Arrays.printArray;

public class Matrix {

    public static int[] rowWiseSum (int[][] mat) {
        int [] sum = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum[i] += mat[i][j];
            }
        }
        return sum;
    }

    public static int[] colWiseSum (int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] sum = new int[m];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                sum[i] += mat[j][i];
            }
        }
        return sum;
    }

    public static void printPrincipalDiagonal(int[][] mat) {
        int row = 0;
        int col = 0;
        while (row < mat.length) {
            System.out.print(mat[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();
    }
    public static void printAntiDiagonal(int[][] mat) {
        int col = mat.length - 1;
        int row = 0;
        while (col >= 0) {
            System.out.print(mat[row][col] + " ");
            row++;
            col--;
        }
        System.out.println();
    }
    public static void printDiagonals(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int row = 0 ;
        for (int col = 0 ; col < m; col++) {
            int i = row ; // fixed the starting point
            int j = col;
            while (i < n && j >= 0) {
                System.out.print(mat[i][j] + " ");
                i++ ;
                j-- ;
            }
            System.out.println();
        }
        int col = m - 1;
        for (row = 1 ; row < n ; row++) {
            int i = row ;
            int j = col ;

            while(i < n && j >= 0) {
                System.out.print(mat[i][j]);
                i++ ;
                j--;
            }
            System.out.println();
        }
    }

    public static void transposeOfMatrix(int[][] mat) {

    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},

        };
//        print2DArrays(mat);
        int[] sum = rowWiseSum(mat);
        System.out.println("Printing row wise sum ");
        printArray(sum);
        sum = colWiseSum(mat);
        System.out.println("Printing column wise sum ");
        printArray(sum);
//        System.out.println("Printing principal diagonal ");
//        printPrincipalDiagonal(mat);
//        System.out.println("Printing anti-diagonal ");
//        printAntiDiagonal(mat);
        System.out.println("Printing all the diagonals ");
        printDiagonals(mat);
    }
}
