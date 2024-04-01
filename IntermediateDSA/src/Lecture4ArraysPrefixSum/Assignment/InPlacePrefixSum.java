package Lecture4ArraysPrefixSum.Assignment;

public class InPlacePrefixSum {
    public static int[] getPrefixSum(int[] A) {
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1 ; i < A.length ; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int [] prefixSum = getPrefixSum(A);
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}
