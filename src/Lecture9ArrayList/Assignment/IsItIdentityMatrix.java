package Lecture9ArrayList.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItIdentityMatrix {
    public static int solve(final List<ArrayList<Integer>> A ) {
        int n = A.size();
        for (int row = 0 ; row < n;  row++) {
            for (int col = 0 ; col < n ; col++) {
                if ( (row == col && A.get(row).get(col) != 1) || (row != col && A.get(row).get(col) != 0) )  {
                    if (A.get(row).get(col) != 1) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x ;
        List<ArrayList<Integer>> mat = new ArrayList<>();
        for (int row = 0 ; row < num ; row++) {
            mat.add(new ArrayList<>());
            for (int col = 0 ; col < num ; col++) {
                x = sc.nextInt();
                mat.get(row).add(x);
            }
        }
        System.out.println(solve(mat));
    }
}
