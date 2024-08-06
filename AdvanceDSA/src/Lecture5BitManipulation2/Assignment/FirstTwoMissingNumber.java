package Lecture5BitManipulation2.Assignment;

public class FirstTwoMissingNumber {
    public static int[] findMissingNumbers(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= (i + 1);
        }
        xor ^= (n + 1);
        xor ^= (n + 2);

        int setBit = 1;
        while ((xor & setBit) == 0) {
            setBit <<= 1;
        }

        int group1 = 0, group2 = 0;
        for (int i = 0; i < n; i++) {
            if ((nums[i] & setBit) == 0) {
                group1 ^= nums[i];
            } else {
                group2 ^= nums[i];
            }
            if (((i + 1) & setBit) == 0) {
                group1 ^= (i + 1);
            } else {
                group2 ^= (i + 1);
            }
        }
        if (((n + 1) & setBit) == 0) {
            group1 ^= (n + 1);
        } else {
            group2 ^= (n + 1);
        }
        if (((n + 2) & setBit) == 0) {
            group1 ^= (n + 2);
        } else {
            group2 ^= (n + 2);
        }

        int[] ans = new int[2];
        if (group1 > group2) {
            ans[1] = group1;
            ans[0] = group2;
        }
        else {
            ans[1] = group2;
            ans[0] = group1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {5, 1, 3, 6};
        int[] B = {3, 2, 4};
        int[] res1 = findMissingNumbers(A);
        int[] res2 = findMissingNumbers(B);
        for(int a : res1) {
            System.out.print(a + " ");
        }
        for(int a : res2) {
            System.out.print(a + " ");
        }
    }
}
/*
Problem Description
Given an array A of length N where all the elements are distinct and are in the range [1, N+2].

Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= N+2

The elements of array A are distinct



Input Format
Only argument A is an array of integers



Output Format
Return a sorted array of size 2 denoting the missing elements.



Example Input
Input 1:
A = [3, 2, 4]
Input 2:
A = [5, 1, 3, 6]


Example Output
Output 1:
[1, 5]
Output 2:
[2, 4]


Example Explanation
For Input 1:
The missing numbers are 1 and 5.
For Input 2:
The missing numbers are 2 and 4.
 */