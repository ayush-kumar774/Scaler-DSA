package Lecture6Recursion1;

public class Recursion {
    public static long sumOfNaturalNumbers(int N) {
        if (N == 1) {
            return 1 ;
        }
        else return N + sumOfNaturalNumbers(N - 1);
    }

    public static long factorial (int N) {
        if (N == 0) {
            return 1 ;
        }
        else return N * factorial(N - 1);
    }

    public static void printMatrixRecursive(int[][] matrix, int row, int col) {
        // Base case: If we have reached the end of the matrix, return
        if (row == matrix.length) {
            return;
        }

        // Print the current element
        System.out.print(matrix[row][col] + " ");

        // Move to the next column
        if (col < matrix[0].length - 1) {
            printMatrixRecursive(matrix, row, col + 1);
        }
        // Move to the next row
        else {
            System.out.println(); // Move to the next line
            printMatrixRecursive(matrix, row + 1, 0);
        }
    }

    public static int fib(int N) {
        if (N == 0 || N == 1) {
            return N ;
        }
//        else if (N == 1) {
//            return 1 ;
//        }
        else return fib(N - 1) + fib(N - 2);
    }

    public static void printInIncreasingOrder(int N) {
        if (N == 0) {
            return;
        }
        printInIncreasingOrder(N - 1);
        System.out.print(N + " ");
    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(10));
        System.out.println(factorial(0));
        System.out.println(fib(8));
        printInIncreasingOrder(9);
        System.out.println();
        System.out.println(foo(3, 5));
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        printMatrixRecursive(matrix, 0, 0);
    }

    public static int bar(int x, int y) {
        if (y == 0) return 0;
        return (x + bar(x, y -1));
    }
    public static int foo(int x, int y) {
        if (y == 0) return 1 ;
        return bar(x, foo(x, y - 1));
    }

}
