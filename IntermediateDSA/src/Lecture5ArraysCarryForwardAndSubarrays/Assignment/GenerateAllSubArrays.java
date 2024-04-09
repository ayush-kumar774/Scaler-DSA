package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

import static Lecture3IntroductionToArrays.Arrays.print2DArrays;

public class GenerateAllSubArrays {
    public static int[][]solve (int[] A) {
        int n = A.length;
        int total = (n * (n + 1)) / 2 ;
        int [][] twoD = new int[total][];
        int m = 0 ;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n ; j++) {
                int[] oneD = new int[j - i + 1] ;
                int index = 0 ;
                for (int k = i ; k <= j ; k++ ) {
                    oneD[index] = A[k];
                    index++;
                }
                twoD[m] = oneD;
                m++;
            }
        }
        return twoD;
    }
    public static void main(String[] args) {
        int[] A = {5, 2, 1, 4};
        int[][] ans = solve(A);
        print2DArrays(ans);
    }
}
