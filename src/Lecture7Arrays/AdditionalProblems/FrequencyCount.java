package Lecture7Arrays.AdditionalProblems;

import java.util.Scanner;

public class FrequencyCount {
    public static int frequency(int[] A, int x) {
        int counter = 0 ;
        for (int j : A) {
            if (j == x) {
                counter++;
            }
        }
        return counter;
    }
    public static int[] solve(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0 ; i < A.length ; i++) {
            ans[i] = frequency(A, A[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ans = solve(new int[]{1, 2, 5, 1, 5, 1});
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
