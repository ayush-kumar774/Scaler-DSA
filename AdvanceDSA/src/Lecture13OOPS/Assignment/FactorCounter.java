package Lecture13OOPS.Assignment;


import Lecture5BitManipulation2.TwoNumberWithOneOccurrence;

public class FactorCounter {

    public static int countFactors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }

        return count;
    }

    public static int[] prefixSum(int[] A) {
        int[] prefixSum = new int[A.length];

        for (int i = 0 ; i < A.length ; i++) {
            prefixSum[i] = countFactors(A[i]) >= 3 ? 1  : 0;
        }
        return prefixSum;
    }

    public static int[] solve (int[] A, int[][] B) {
        int n = A.length;

        int[] prefixSum = prefixSum(A);
        for (int i = 1 ; i < n ; i++) {
            prefixSum[i] += prefixSum[i - 1] ;
        }

        int[] result = new int[B.length];

        for (int i = 0 ; i < B.length ; i++) {
            int L = B[i][0];
            int R = B[i][1];
            if (L - 1 == 0) {
                result[i] = prefixSum[R - 1];
            }
            else {
                result[i] = prefixSum[R - 1] - prefixSum[L - 2];
            }
        }

        return result;
    }
    public static void main(String[] args) {
       int[] A1 = {1, 8, 12, 15, 5};
       int[][] Q1 = {
               {1, 3},
               {2, 5},
               {4, 4}
       };

       int[] A2 = {11, 8, 2, 7, 15};
       int[][] Q2 = {
               {2, 3},
               {1, 5},
               {3, 4}
       };

       int[] result1 = solve(A1, Q1);
       int[] result2 = solve(A2, Q2);

       System.out.println("Result for 1 ");
       TwoNumberWithOneOccurrence.print(result1);
       System.out.println("Result for 2 ");
        for (int res : result2) {
            System.out.print(res + " ");
        }
    }
}
