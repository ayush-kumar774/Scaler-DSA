package Lecture5BitManipulation2.Assignment;

import java.util.Arrays;

public class SingleNumber3 {
    private static int[] singleNumber3 (int[] A) {
        int[] ans = new int[2];
        int res = 0 ;
        for (int k : A) {
            res ^= k ;
        }
        int pos = 0 ;
        for (pos = 0 ; pos < 32; pos++) {
            if ( (res & (1 << pos)) > 0 ) {
                break;
            }
        }
        for (int num : A) {
            if ( (num & (1 << pos)) > 0) {
                ans[0] ^= num;
            }
        }
        ans[1] = res ^ ans[0];
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 1, 2, 4};
        int[] A2 = {1, 2};

        System.out.println(Arrays.toString(singleNumber3(A1)));
        System.out.println(Arrays.toString(singleNumber3(A2)));
    }
}

/*
Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Note: Return the two numbers in ascending order.


Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
The first argument is an array of integers of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.
 */