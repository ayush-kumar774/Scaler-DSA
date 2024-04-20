package Lecture6SlidingWindowAndContributionTechnique.AdditionalProblems;

public class SubarrayWithLeastAverage {
    public static int solve(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return 0 ;
        int sum = 0 ;
        int index = 0;
        int minSum;
        for (int i = 0 ; i < k ; i++) {
            sum += arr[i];
        }
        System.out.println("Sum for 0 --> "  + sum);
        minSum = sum ;
        for (int i = 1 ; i < (n - k + 1) ; i++) {
            sum = (sum - arr[i - 1] + arr[i + k - 1]);
            System.out.println("Sum for " + i + " --> " + sum);
            if (sum < minSum) {
                System.out.println("Min sum --> " + minSum);
                minSum = sum;
                index = i ;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 90, 20, 10, 50, 40};
        int[] arr2 = {3, 7, 5, 20, -10, 0, 12};
        int[] arr3 = {15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};
        int b1 = 3;
        int b2 = 2;
        int b3 = 6;
//        System.out.println(solve(arr1, b1));
//        System.out.println(solve(arr2, b2));
        System.out.println(solve(arr3, b3));
    }
}
/*
Problem Description
Given an array A of size N, find the subarray of size B with the least average.



Problem Constraints
1 <= B <= N <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N.
Second argument contains integer B.


Output Format
Return the index of the first element of the subarray of size B that has least average.
Array indexing starts from 0.


Example Input
Input 1:
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
Input 2:

A = [3, 7, 5, 20, -10, 0, 12]
B = 2


Example Output
Output 1:
3
Output 2:

4


Example Explanation
Explanation 1:
Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average
among all subarrays of size 3.
Explanation 2:

 Subarray between [4, 5] has minimum average
 */
