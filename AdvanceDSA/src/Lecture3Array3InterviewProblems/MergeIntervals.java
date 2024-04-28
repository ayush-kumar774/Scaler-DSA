package Lecture3Array3InterviewProblems;

import java.util.ArrayList;

public class MergeIntervals {
    public static boolean isOverlap(int[][]A) {
        int s1 = A[0][0];
        int s2 = A[1][0];
        int e1 = A[0][0];
        int e2 = A[1][0];
        return (e1 >= s2 && e2 >= s1);
    }
    public static void main(String[] args) {

    }
}
