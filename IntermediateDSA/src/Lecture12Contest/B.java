package Lecture12Contest;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class B {
    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] cumulativeNonNegative = new int[n];

        cumulativeNonNegative[0] = A[0] >= 0 ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (A[i] >= 0) {
                cumulativeNonNegative[i] = cumulativeNonNegative[i - 1] + 1;
            }
            else {
                cumulativeNonNegative[i] = cumulativeNonNegative[i - 1];
            }
        }

        int[] results = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if (start == 0) {
                results[i] = cumulativeNonNegative[end];
            }
            else {
                results[i] = cumulativeNonNegative[end] - cumulativeNonNegative[start - 1];
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, -1, -8, 10, 0};
        int[][] B = {
                {1, 4},
                {2, 4},
                {0, 3},
                {3, 5}
        };
        int[] ans = solve(A, B);
        printArray(ans);
    }
}
