package Lecture2Array2TwoDimensional;


import static Lecture2Array2TwoDimensional.PrintBoundary.printBoundary;

public class SpiralMatrix {
    public static void spiralMatrix(int[][] A) {
        int i = 0 , j = 0 ;
        int N = A.length ;
        while (N > 1) {
            printBoundary(A, i , j, N);
            i = i + 1 ;
            j = j + 1;
            N = N - 2 ;
        }
        if (N == 1) {
            System.out.println(A[i][j]);
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        spiralMatrix(A);
    }
}
