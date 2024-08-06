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

/*
Problem Description
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, return the remainder on dividing the result with 109+7


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
Single argument which is an integer array A.


Output Format
Return an integer.


Example Input

Input 1:
A = [1, -1, -2, 2]

Input 2:
A = [-1, 2, -1]


Example Output

Output 1:
3

Output 2:
1


Example Explanation

Explanation 1:
The sub arrays with zero sum are [1, -1], [-2, 2] and [1, -1, -2, 2].
Explanation 2:

 The subarray with zero sum is [-1, 2, -1].
 */