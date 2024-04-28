package Lecture2Array2TwoDimensional;

public class PrintBoundary {
    public static void printBoundary(int[][] A, int s, int e, int N) {
        int i = s , j = e , k;
        int n = N;
        for (k = 1 ; k <= n - 1 ; k++) {
            System.out.print(A[i][j] + " ");
            j++;
        }

        for (k = 1 ; k <= n - 1 ; k++) {
            System.out.print(A[i][j] + " ");
            i++;
        }

        for (k = 1 ; k <= n - 1 ; k++) {
            System.out.print(A[i][j] + " ");
            j-- ;
        }

        for (k = 1 ; k <= n - 1 ; k++) {
            System.out.print(A[i][j] + " ");
            i-- ;
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printBoundary(A, 0, 0, A.length);
    }
}
