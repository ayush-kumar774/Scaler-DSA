package Lecture9ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixScalarProduct {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int m = A.get(0).size();
        for (ArrayList<Integer> integers : A) {
            for (int col = 0; col < m; col++) {
                int x = integers.get(col);
                x *= B;
                integers.set(col, x);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>(n);
        int x ;
        for (int row = 0 ; row < n ; row++)
        {
            A.add(new ArrayList<>());
            for (int col = 0 ; col < m ; col++) {
                x = sc.nextInt();
                A.get(row).add(x);
            }
        }
        int b = sc.nextInt();
        // System.out.println(A);
        System.out.println(solve(A, b));
    }
}
