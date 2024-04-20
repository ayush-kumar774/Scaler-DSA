package Lecture8SortingBasics;

import Lecture4ArraysPrefixSum.Assignment.InPlacePrefixSum;

import java.util.Arrays;

public class CostOfDeletingElements {

    public static int costOfDeletingElement(int[] A) {
        Arrays.sort(A);
        int ans = 0 ;
        for (int i = 0 ; i < A.length ; i++) {
            ans += (A[i] * (A.length - i ));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A= {4, 6, 1};
        System.out.println(costOfDeletingElement(A));
    }
}
