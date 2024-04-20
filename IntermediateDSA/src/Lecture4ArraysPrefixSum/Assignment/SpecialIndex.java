package Lecture4ArraysPrefixSum.Assignment;

public class SpecialIndex {
    public static int findSpecialIndex(int[] A) {
        int counter = 0;
        int n = A.length;
        long totalEvenSum = 0;
        long totalOddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) totalEvenSum += A[i];
            else totalOddSum += A[i];
        }

        long evenSum = 0;
        long oddSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (evenSum + (totalOddSum - oddSum) == oddSum + (totalEvenSum - evenSum - A[i])) {
                    counter++;
                }
                evenSum += A[i];
            } else {
                if (evenSum + (totalOddSum - oddSum - A[i]) == oddSum + (totalEvenSum - evenSum)) {
                    counter++;
                }
                oddSum += A[i];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] A = {2, 1, 6, 4};
        System.out.println(findSpecialIndex(A));
    }
}
/*
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105
Sum of all elements of A <= 109


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A = [2, 1, 6, 4]
Input 2:

A = [1, 1, 1]


Example Output
Output 1:
1
Output 2:

3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
Therefore, the required output is 1.
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Therefore, the required output is 3.
 */