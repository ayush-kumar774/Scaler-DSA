package Lecture9ArrayList.AdditionalProblems;

import java.util.ArrayList;

public class MatrixTranspose {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.get(0).size();

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i = 0; i < cols; i++) {
            transpose.add(new ArrayList<>());
            for(int j = 0; j < rows; j++) {
                transpose.get(i).add(A.get(j).get(i));
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        // Add rows to the matrix
        A.add(new ArrayList<>());
        A.get(0).add(1);
        A.get(0).add(2);
        A.get(0).add(3);

        A.add(new ArrayList<>());
        A.get(1).add(4);
        A.get(1).add(5);
        A.get(1).add(6);

        // Call the solve function to get the transpose of the matrix A
        ArrayList<ArrayList<Integer>> transpose = solve(A);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for(ArrayList<Integer> row : transpose) {
            for(int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
