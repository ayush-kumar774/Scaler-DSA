package Lecture16SortingBasicsMergeSortAndCountSort.AdditionalProblems;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
    private static int solve(int[] A) {
        Arrays.sort(A);
        int min = A[1] - A[0];
        for (int i = 2 ; i < A.length ; i++) {
            if (min > (A[i] - A[i - 1]) ) {
                min = (A[i] - A[i - 1]);
                if (min == 0) return 0;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[] A2 = {5, 17, 100, 11};

        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }
}
