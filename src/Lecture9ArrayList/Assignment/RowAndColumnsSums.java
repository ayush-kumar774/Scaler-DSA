package Lecture9ArrayList.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class RowAndColumnsSums {
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> sumOfRowAndColumn = new ArrayList<>();
        int n = A.size();
        int m = A.get(0).size();
        for (int row = 0 ; row < n ; row++) {
            int sum = 0 ;
            for (int col = 0 ; col < m ; col++) {
                sum += A.get(row).get(col);
            }
            sumOfRowAndColumn.add(sum);
        }
        for (int col = 0 ; col < m ; col++) {
            int sum = 0 ;
            for (int row = 0 ; row < n ; row++) {
                sum += A.get(row).get(col);
            }
            sumOfRowAndColumn.add(sum);
        }
        return sumOfRowAndColumn;
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
//        System.out.println(A);
        System.out.println(solve(A));
    }

}
