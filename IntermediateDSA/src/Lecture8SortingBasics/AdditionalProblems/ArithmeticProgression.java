package Lecture8SortingBasics.AdditionalProblems;

import java.util.Arrays;

public class ArithmeticProgression {
    public static int isArithmeticProgression(int[] A) {
        int n = A.length;
        if (n == 1) return 1 ;
        Arrays.sort(A);
        int d =  A[1] - A[0];
        for (int i = 2 ; i < n ; i++) {
            if (d != A[i] - A[i - 1]) {
                return 0 ;
            }
        }
        return 1 ;
    }
    public static void main(String[] args) {
        int[] A = {3, 5, 1};
        int[] B = {2, 4, 1};
        System.out.println(isArithmeticProgression(A));
        System.out.println(isArithmeticProgression(B));
    }
}
