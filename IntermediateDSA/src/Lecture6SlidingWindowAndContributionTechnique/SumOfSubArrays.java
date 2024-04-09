package Lecture6SlidingWindowAndContributionTechnique;

public class SumOfSubArrays {

    public static long sumOfAllSubArrays(int[] A) {
        long sum = 0 ;
        for (int i = 0 ; i < A.length ; i++) {
            for (int j = i ; j < A.length ; j++) {
                for (int k = i ; k <= j ; k++) {
                    sum += A[k];
                }
            }
        }
        return sum;
    }

    public static long sumOfAllSubArraysOptimized(int[] A) {
        int max = 0 ;
        int maxLimit = 75;
        long ans = 0 ;
        for (int i = 0 ; i < A.length ; i++) {
            int sum = 0;
            for (int j = i ; j < A.length ; j++) {
                sum += A[j];
                if (sum > max && sum <= maxLimit) {
                    max = sum;
                }
                ans += sum;

            }
//            ans += sum;
            // This we add 2 + 5 +3 = 10 instead of (2 + (2 + 5) + (2 + 5 + 3)) this is
            // why we are adding sum to ans after each iteration.
        }
        System.out.println("Max under limit " + max);
        return ans;
    }

    public static long sumOfAllSubArraysOptimized2(int[] A) {
        long sum = 0;
        int n = A.length;
        for (int i = 0 ; i < n; i++) {
            sum += ((long) A[i] * (i + 1) * (n - i)); // this is called contribution technique
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 3, 4, 5};
        int[] B = {4};
//        System.out.println(sumOfAllSubArrays(A));
        System.out.println(sumOfAllSubArraysOptimized(A));
        System.out.println(sumOfAllSubArraysOptimized(B));
//        System.out.println(sumOfAllSubArraysOptimized2(A));
    }
    /*
        Optimization : -
            1. Use prefix sum approach to eliminate innermost loop.
                a. Calculate Prefix Sum TC: O(N) SC: O(N)
            TC : O(N^2)
            SC : O(N)
     */
}
