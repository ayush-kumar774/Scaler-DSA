package Lecture9Contest1ArraysAndBitManipulation;

public class DecreasingDishes {
    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int maxSoFar = A[0];
        for (int i = 1;  i < n ; i++) {
            if (A[i - 1] > A[i]) {
                maxSoFar = maxSoFar + A[i];
            }
            else {
                max = Math.max(max, maxSoFar);
                maxSoFar = A[i] ;
            }
        }
        return Math.max(max, maxSoFar);
    }
    public static void main(String[] args) {
        int[] A = {3, 2, 1};
        int[] B = {3, 3, 5, 0, 1};
        System.out.println(solve(A));
        System.out.println(solve(B));
    }
}
/*
Given an array of N positive integers representing the weights of ingredients in a dish.
Find the maximum possible sum of a subarray with decreasing weights.

Input 1:
A = {3, 2, 1}

Input 2:
A = {3, 3, 5, 0, 1}

Output 1:
6

Output 2:
5
 */