package Lecture20BinarySearchOnAnswer.AdditionalProblems;

public class SpecialInteger {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        int[] A2 = {5, 17, 100, 11};
        int B1 = 10, B2 = 130;

        System.out.println(solve(A1, B1));
        System.out.println(solve(A2, B2));
    }
    public static int solve(int[] A, int B) {
        long [] prefixSum = new long[A.length];
        prefixSum[0] = A[0];
        for (int i = 1 ; i < A.length; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }
        int start = 1;
        int end = A.length;
        int ans = 0;

        while(start <= end) {
            int mid = start + (end - start) / 2 ;
            if (isPossible(prefixSum, mid, B)) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(long[] prefixSum, int  K, int B) {
        if (prefixSum[K - 1] > B) return false;
        for (int i = 1 ; i <= prefixSum.length - K  ; i++) {
            if ( (prefixSum[i + K - 1] - prefixSum[i - 1]) > B) {
                return false;
            }
        }
        return true;
    }
}
