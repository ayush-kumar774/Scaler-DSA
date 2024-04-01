package Lecture3IntroductionToArrays.Assignment;

public class MaxMinOfAnArray {
    public static int solve(int[] A) {
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = A.length;
        for (int i = 0 ; i < n ; i++) {
            if (A[i] > max) max = A[i];
            if (A[i] < min) min = A[i];
        }
        return (min + max);
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4} ;
        System.out.println(solve(arr));
    }

}
