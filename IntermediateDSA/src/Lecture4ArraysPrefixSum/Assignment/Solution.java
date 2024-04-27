package Lecture4ArraysPrefixSum.Assignment;

public class Solution {
    public static long[] getEvenIndexPrefixSum(int[] A) {
        long[] evenPrefixSum = new long[A.length];
        evenPrefixSum[0] = A[0];
        for (int i = 1 ; i < A.length ; i++) {
            if (i % 2 == 0) {
                evenPrefixSum[i] = evenPrefixSum[i - 1] + A[i];
            }
            else {
                evenPrefixSum[i] = evenPrefixSum[i - 1];
            }
        }
        return evenPrefixSum;
    }
    public static long[] getOddIndexPrefixSum(int[] A) {
        long[] oddPrefixSum = new long[A.length];
        oddPrefixSum[0] = 0 ;
        for (int i = 1 ; i < A.length ; i++) {
            if (i % 2 == 1) {
                oddPrefixSum[i] = oddPrefixSum[i - 1] + A[i];
            }
            else {
                oddPrefixSum[i] = oddPrefixSum[i - 1];
            }
        }
        return oddPrefixSum;
    }

    public static long getEvenSum(int[] A, int start, int end) {
        long[] evenPrefixSum = getEvenIndexPrefixSum(A);
        if (start == end && start == 0) return 0 ;
        long sum = 0 ;
        if (start == 0) {
            sum = evenPrefixSum[end];
        }
        else {
            sum = evenPrefixSum[end] - evenPrefixSum[start - 1];
        }
        System.out.println("Get even sum --> " + sum + " for range " + start + " " + end);
        return sum;
    }

    public static long getOddSum(int[] A, int start, int end) {
        long[] oddPrefixSum = getOddIndexPrefixSum(A);
        if (start == end && start == 0) return 0 ;
        long sum = 0 ;
        if (start == 0) {
            sum = oddPrefixSum[end];
        }
        else {
            sum = oddPrefixSum[end] - oddPrefixSum[start - 1];
        }
        System.out.println("Get odd sum --> " + sum + " for range " + start + " " + end );
        return sum;

    }

    public static int solve(int[] A) {
        int counter = 0;
        int n = A.length;

        // Pre-compute total sums for even and odd indices.
        long totalEvenSum = 0;
        long totalOddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) totalEvenSum += A[i];
            else totalOddSum += A[i];
        }

        long evenSum = 0; // Sum of elements at even indices up to current index.
        long oddSum = 0;  // Sum of elements at odd indices up to current index.

        for (int i = 0; i < n; i++) {
            // Adjust total sums by removing the current element's contribution.
            if (i % 2 == 0) {
                // Check condition before removing the element at even index.
                if (evenSum + (totalOddSum - oddSum) == oddSum + (totalEvenSum - evenSum - A[i])) {
                    counter++;
                }
                evenSum += A[i];
            } else {
                // Check condition before removing the element at odd index.
                if (evenSum + (totalOddSum - oddSum - A[i]) == oddSum + (totalEvenSum - evenSum)) {
                    counter++;
                }
                oddSum += A[i];
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 1}));
    }
}
