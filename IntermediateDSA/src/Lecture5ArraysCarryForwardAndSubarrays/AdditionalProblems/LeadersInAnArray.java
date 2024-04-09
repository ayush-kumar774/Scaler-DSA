package Lecture5ArraysCarryForwardAndSubarrays.AdditionalProblems;

import java.util.ArrayList;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class LeadersInAnArray {
    public static int[] findLeaders(int[] A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.length;
        ans.add(A[n - 1]);
        int max = A[n - 1] ;
        for (int i = (n - 2) ; i >= 0 ; i--) {
            if (A[i] > max) {
                ans.add(A[i]);
                max = A[i];
            }
        }
        int[] leaders = new int[ans.size()];
        for (int i = 0 ;i < ans.size(); i++) {
            leaders[i] = ans.get(i);
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] A = {5, 4};
        int[] ans = findLeaders(A);
        printArray(ans);
    }
}
