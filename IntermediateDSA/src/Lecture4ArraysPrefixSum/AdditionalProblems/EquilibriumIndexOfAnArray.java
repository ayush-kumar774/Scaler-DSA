package Lecture4ArraysPrefixSum.AdditionalProblems;

import static Lecture4ArraysPrefixSum.Assignment.InPlacePrefixSum.getPrefixSum;

public class EquilibriumIndexOfAnArray {
    public static int prefixSumRangeBased (int[] A, int start, int end) {
        int[] prefixSum = getPrefixSum(A);
        int sum;
        if (start == 0) {
            sum = prefixSum[end];
        }
        else {
            sum = prefixSum[end] - prefixSum[start - 1] ;
        }
        return sum ;
    }
    public static int solve(int[] A) {
        int n = A.length;
        int ans = -1;
        for (int i = 0 ; i < n ; i++) {
            long lowerSum = 0;
            if (i > 0) {
                lowerSum = prefixSumRangeBased(A, 0, i - 1);
            }
            long higherSum = prefixSumRangeBased(A, i + 1 , n - 1) ;
            if (lowerSum == higherSum) {
                ans = i ;
                break ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] A = new int[] {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }
}
