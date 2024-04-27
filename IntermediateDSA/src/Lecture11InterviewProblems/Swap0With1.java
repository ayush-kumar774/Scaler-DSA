package Lecture11InterviewProblems;

import static Lecture11InterviewProblems.Replace0With1.leftConsecutiveOnes;
import static Lecture11InterviewProblems.Replace0With1.rightConsecutiveOnes;

public class Swap0With1 {
    public static int maximumConsecutiveOne(int[] A) {
        int ones = 0;
        int max = 0 ;
        int n = A.length;
        for (int a : A) {
            if (a == 1) ones++;
        }
        if (ones == n) {
            return n;
        }
        else if (ones == 0){
            return 0 ;
        }
        else {
            int[] left = leftConsecutiveOnes(A);
            int[] right = rightConsecutiveOnes(A);

            for (int i = 0 ; i < n; i++) {
                if (A[i] == 0) {
                    int l = left[i];
                    int r = right[i];
                    if (l + r < ones ) {
                        max = Math.max(max, (l + r +1));
                    }
                    if (l + r == ones) {
                        max = Math.max(max, l + r) ;
                    }
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 1, 1, 0, 1};
        int[] B = {1, 1, 0, 1, 1, 1};
        System.out.println(maximumConsecutiveOne(A));
        System.out.println(maximumConsecutiveOne(B));
    }
}
/*
Given an array of 0s and 1s you are allowed to swap one 0 with a 1.
Find the max no of consecutive 1s that can be obtained after swapping.

int[] A = {1, 0, 1, 1, 0, 1} --> Answer 4
int[] A = {1, 1, 0, 1, 1, 1} --> Answer 5
 */
