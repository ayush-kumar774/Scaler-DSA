package Lecture14HashingBasics.AdditionalProblems;

import java.util.HashMap;

public class CountSubarrayWithZeroSum {
    private static int solve(int[] A) {
        int MOD = 1000000007;
        int n = A.length;

        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        int count = 0 ;
        int prefixSum = 0 ;

        prefixSumFreq.put(0, 1);

        for (int j : A) {
            prefixSum += j;

            if (prefixSumFreq.containsKey(prefixSum)) {
                count = (count + prefixSumFreq.get(prefixSum)) % MOD;
            }

            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, -1, -2, 2};
        int[] B = {-1, 2, -1};

        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
