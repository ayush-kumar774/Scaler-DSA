package Lecture8_2DArrays;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] mat = new int[n][m];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Given a matrix print top row

        // row = mat.length;
        // column = mat[0].length;
        System.out.println("Printing the top row");
        for (int col = 0 ; col < mat[0].length ; col++) {
            System.out.print(mat[0][col] + " ");
        }
        System.out.println();

        // Given a matrix, print left most column of a matrix
        System.out.println("Printing the leftmost column");
        for (int row = 0 ; row < mat.length; row++) {
            System.out.print(mat[row][0] + " ");
        }
        System.out.println();

        // Given a matrix, print column by column
        System.out.println("Printing the matrix column by column");
        for (int col = 0 ; col < m ; col++) {
            for (int row = 0 ; row < n ; row++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }


        // Given a matrix, print row by row
        System.out.println("Printing the matrix row by row");
        for (int row = 0 ; row < n ; row++) {
            for (int col = 0 ; col < m ; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

        // Given a matrix, print its sum
        int sum = 0 ;
        for (int row = 0 ; row < n ; row++) {
            for (int col = 0 ; col < m ; col++) {
                sum += mat[row][col];
            }
        }
        System.out.println("Sum of the matrix " + sum);

        // Given a matrix print waveform
        /*
         1 2 3
         4 5 6
         7 8 9

         Output
         1 2 3
         6 5 4
         7 8 9

         // Odd number printing right to left
         */

        for (int row = 0 ; row < n ; row++) {
            if (row % 2 == 0) {
                for (int col = 0 ; col < m ; col++) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            else {
                for (int col = m - 1 ; col >= 0 ; col--) {
                    System.out.print(mat[row][col] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Printing row wise sum");
        int[]ans = rowWiseSum(mat);
        for(int a : ans) {
            System.out.print(a  + " " );
        }
        System.out.println();

        System.out.println("Printing column wise maximum");
        int[]ans2 = columnWiseMaximum(mat);
        for (int a : ans2) {
            System.out.print(a + " ");
        }
    }
    // Given N*M matrix return row wise sum
    private static int[] rowWiseSum(int[][] mat) {
        int[] rowWiseSum = new int[(mat.length)];
        for (int row = 0 ; row < mat.length; row++) {
            int rowSum = 0 ;
            for (int col = 0 ; col < mat[0].length ; col++) {
                rowSum += mat[row][col];
            }
            rowWiseSum[row] = rowSum;
        }
        return rowWiseSum;
    }

    // Given a matrix, print column wise maximum
    private static int[] columnWiseMaximum(int[][] mat) {
        int[] columnWiseMaximum = new int[(mat[0].length)];
        for (int col = 0 ; col < mat[0].length ; col++) {
            int colMax = Integer.MIN_VALUE ;
            for (int row = 0 ; row < mat.length ; row++) {
                colMax = Math.max(colMax, mat[row][col]);
            }
            columnWiseMaximum[col] = colMax;
        }
        return columnWiseMaximum;
    }
}
