package Lecture11InterviewProblems;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class Replace0With1 {
    public static int[] leftConsecutiveOnes(int[] A) {
        int n = A.length;
        int[] left = new int[n];
        left[0] = A[0] == 1 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            if (A[i] == 1 && A[i - 1] == 1) {
                left[i] = left[i - 1] + 1;
            } else if (A[i] == 1 && A[i - 1] == 0) {
                left[i] = 1;
            } else {
                left[i] = left[i - 1];
            }
        }
        return left;
    }
    public static int[] rightConsecutiveOnes(int[] A) {
        int n = A.length;
        int[] right = new int[n];

        right[n - 1] = A[n - 1] == 1 ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] == 1 && A[i + 1] == 1) {
                right[i] = right[i + 1] + 1;
            } else if (A[i] == 1 && A[i + 1] == 0) {
                right[i] = 1;
            } else {
                right[i] = right[i + 1];
            }
        }
        return right;
    }
    public static int maxConsecutiveOnes(int[] A) {
        int n = A.length;
        int max = 0;

        int zeroCounter = 0 ;
        for (int a : A) {
            if (a == 0) zeroCounter++;
        }

        if (zeroCounter == 0) return n;
        else
        {
            int[] left = leftConsecutiveOnes(A);
            int[] right = rightConsecutiveOnes(A);
//            printArray(left);
//            printArray(right);
            for (int i = 0 ; i < n ; i++) {
                if (A[i] == 0) {
                    max = Math.max(max, (left[i] + right[i] + 1));
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1};
        System.out.println(maxConsecutiveOnes(A));
    }
}

/*
Given an array of 0s and 1s you are allowed to replace one 0 with a 1.
Find the max no of consecutive 1s that can be obtained after making the replacement.

A: 1 1 0 1 1 0 1 1  Answer --> 5
left: 1 2 2 1 2 2 1 2
right: 2 1 2 2 1 2 2 1
Ans: for each 0 find left[index of 0] and right[index of 0] + 1 and return the max
if no zero then we will return length of the array



A: 1 1 0 1 1 0 1 1 1 Answer --> 6
A: 0 1 1 1 0 1 1 0 1 1 0 Answer --> 6
 */
