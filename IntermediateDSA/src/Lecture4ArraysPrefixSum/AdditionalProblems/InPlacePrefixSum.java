package Lecture4ArraysPrefixSum.AdditionalProblems;

import static Lecture4ArraysPrefixSum.Assignment.InPlacePrefixSum.getPrefixSum;

public class InPlacePrefixSum {

    public static int[] solve(int[] A) {
        return getPrefixSum(A);
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 4, 5};
        A = solve(A);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }
}
