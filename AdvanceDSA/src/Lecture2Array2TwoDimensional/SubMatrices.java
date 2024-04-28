package Lecture2Array2TwoDimensional;

import java.util.ArrayList;

public class SubMatrices {
    public static int sumOfAllSubMatrices(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0 ;

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                sum = sum + (matrix[i][j] * ( ( (i + 1) * (j + 1) ) * ( (n - i) * (m - j) ) ) );
            }

        }
        return sum ;
    }

    public static void printSubMatrices(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        ArrayList<ArrayList<Integer>> submatrix = new ArrayList<>();
                        for (int i = startRow; i <= endRow; i++) {
                            ArrayList<Integer> row = new ArrayList<>();
                            for (int j = startCol; j <= endCol; j++) {
                                row.add(matrix[i][j]);
                            }
                            submatrix.add(row);
                        }
                        System.out.println(submatrix);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] mat = {
                {3, 1},
                {-1, -2},
                {2, 4}
        };
//        printSubMatrices(matrix);
        System.out.println(sumOfAllSubMatrices(mat));
    }
}

