package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

public class ClosetMinMax {
    public static int closetMinMaxInASubArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = A.length;
        for (int j : A) {
            if (j > max) max = j;
            if (j < min) min = j;
        }
        int lastMin = -1;
        int lastMax = -1;
        int ans = Integer.MAX_VALUE ;

        for (int i = 0 ; i < n; i++) {
            if (A[i] == max) {
                lastMax = i;
                if (lastMin != -1) {
                    ans = Math.min(i - lastMin + 1, ans);
                }
            }
            if (A[i] == min) {
                lastMin = i;
                if (lastMax != -1)
                {
                    ans = Math.min(i - lastMax + 1, ans);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(closetMinMaxInASubArray(A));
    }
}
/*
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */