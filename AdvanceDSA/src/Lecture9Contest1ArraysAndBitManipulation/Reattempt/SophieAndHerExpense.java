package Lecture9Contest1ArraysAndBitManipulation.Reattempt;

import Lecture5BitManipulation2.TwoNumberWithOneOccurrence;

public class SophieAndHerExpense {
    public static int[] solve(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n] ;

        left[0] = A[0];
        right[n - 1] = A[n - 1] ;

        for (int i = 1 ; i < n ; i++) {
            left[i] = left[i - 1] + A[i];
        }

        for (int i = n - 2 ; i >= 0 ; i--) {
            right[i] = right[i + 1] + A[i];
        }

        for (int i = 0 ; i < n ; i++) {
            ans[i] = Math.abs(right[i] - left[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 1} ;
        int[] ans = solve(A);
        TwoNumberWithOneOccurrence.print(ans);
        int[] A1 = {1, 5, 3, 4};
        ans = solve(A1);
        TwoNumberWithOneOccurrence.print(ans);
    }
}
