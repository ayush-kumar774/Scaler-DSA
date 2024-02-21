package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;
import java.util.List;

public class MainDiagonalSum {
    public static int solve(final List<ArrayList<Integer>> A) {
        int res = 0;
        int n = A.size();
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                if (i == j) {
                    res += (A.get(i).get(j));
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 4; // Size of the square matrix
        ArrayList<ArrayList<Integer>> squareMatrix = new ArrayList<>();

        // Initialize the square matrix with 0s
        for (int i = 0; i < n; i++) {
            // Create a new row
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Add an element to the row
                row.add(1);
            }
            // Add the row to the matrix
            squareMatrix.add(row);
        }

        // Print the square matrix
        System.out.println("Square Matrix:");
        for (ArrayList<Integer> row : squareMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println(solve(squareMatrix));
    }
}
