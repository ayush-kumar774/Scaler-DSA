package Lecture5BitManipulation2;

import java.util.Arrays;

public class PrefixSum {

    public static int sumOfSubarrayValues(int[] A) {
        int MOD = 1000000007;
        int n = A.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int bitwiseOR = A[i];
            sum = (sum + bitwiseOR) % MOD;
            for (int j = i - 1; j >= 0; j--) {
                if ((bitwiseOR | A[j]) == bitwiseOR) // If the new bitwise OR value remains the same, break
                    break;
                bitwiseOR |= A[j];
                sum = (sum + bitwiseOR) % MOD;
            }
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        long result = sumOfSubarrayValues(A);
        System.out.println("Sum of values of all subarrays: " + result);
    }
}

