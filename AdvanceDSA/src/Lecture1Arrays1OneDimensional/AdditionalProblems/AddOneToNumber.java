package Lecture1Arrays1OneDimensional.AdditionalProblems;

import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3};
        int[] A2 = {9, 9, 9};
        int[] A3 = {1, 1, 9};
        int[] A4 = {1, 9, 9};

        System.out.println(Arrays.toString(plusOne(A1)));
        System.out.println(Arrays.toString(plusOne(A2)));
        System.out.println(Arrays.toString(plusOne(A3)));
        System.out.println(Arrays.toString(plusOne(A4)));
    }

    private static int[] removeLeadingZeroes(int[] A) {
        int i = 0 ;
        for (; i < A.length ; i++) {
            if (A[i] != 0) {
                break;
            }
        }
        return Arrays.copyOfRange(A, i, A.length);
    }

    public static int[] plusOne(int[] A) {
        int nineCounter = 0 ;
        A = removeLeadingZeroes(A);
        int n = A.length;
        for (int j : A) {
            if (j == 9) nineCounter++;
        }
        int[] ans;
        if (nineCounter == n) {
            ans = new int[n + 1];
            ans[0] = 1 ;
        }
        else {
            ans = new int[n];
            int carry = 1 ;
            for (int i = n - 1 ; i >= 0; i--) {
                int sum = A[i] + carry;
                if (sum == 10) {
                    carry = 1;
                    ans[i] = 0;
                } else {
                    carry = 0;
                    ans[i] = sum;
                }
            }
        }
//        else {
//            ans = new int[n];
//            if (A[n - 1] != 9) {
//                ans[n - 1] = A[n - 1] + 1;
//                System.arraycopy(A, 0, ans, 0, n - 1);
//            }
//
//            else {
//                ans = new int[n];
//                int index = n - 1;
//                while (A[index] == 9) {
//                    index--;
//                }
//                ans[index] = A[index] + 1;
//                for (int i = 0 ; i < index; i++) {
//                    if (A[i] != 0) {
//                        ans[i] = A[i];
//                    }
//                }
//            }
//        }
        return ans;
    }
}
/*
Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000



Input Format
First argument is an array of digits.



Output Format
Return the array of digits after adding one.



Example Input
Input 1: [1, 2, 3]


Example Output
Output 1: [1, 2, 4]


Example Explanation
Explanation 1:
Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
 */
