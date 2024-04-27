package Lecture3IntroductionToArrays.AdditionalProblems;

public class SecondLargest {
    public static int solve(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int j : A) {
            if (j > max1) max1 = j;
        }

        for (int j : A) {
            if (j > max2 && j < max1) max2 = j;
        }

        if (max2 == Integer.MIN_VALUE) {
            return -1;
        } else {
            return max2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 2};
        System.out.println(solve(arr));
    }
}
/*
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.


Problem Constraints
1 <= |A| <= 105

0 <= A[i] <= 109



Input Format
The first argument is an integer array A.



Output Format
Return the second largest element. If no such element exist then return -1.



Example Input
Input 1:

 A = [2, 1, 2]
Input 2:

 A = [2]


Example Output
Output 1:

 1
Output 2:

 -1


Example Explanation
Explanation 1:

 First largest element = 2
 Second largest element = 1
Explanation 2:

 There is no second largest element in the array.
 */
