package Lecture4ArraysPrefixSum.Assignment;

public class RangeSumQuery {
    public static long[] getPrefixSum(int[] A) {
        long[] prefixSum = new long[A.length];
        prefixSum[0] = A[0];
        for (int i = 1 ; i < A.length ; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        return prefixSum;
    }
    public static long[] rangeSum(int[] A, int[][] B) {
        long[] rangeSum = new long[B.length];
        long[] prefixSum = getPrefixSum(A);
        for (int i = 0 ; i < B.length; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if (start == 0) {
                rangeSum[i] = prefixSum[end];
            }
            else {
                rangeSum[i] = prefixSum[end] - prefixSum[start - 1] ;
            }
        }
        return rangeSum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {
                {0, 3},
                {1, 2}
        };
        long[] longSum = rangeSum(A, B);
        for (long sum : longSum) {
            System.out.print(sum + " ");
        }
    }
}
