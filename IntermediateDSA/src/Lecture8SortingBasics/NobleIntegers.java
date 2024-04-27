package Lecture8SortingBasics;

import java.util.Arrays;

// A[i] is a noble integer if (count of elements < A[i]) = A[i]
public class NobleIntegers {
    public static int countNobleIntegers(int[] A) {
        int count = 0 ;
        int n = A.length;
        for (int i = 0 ; i < n ; i++) {
            if (A[i] == i) {
                count++;
            }
        }
        return count;
    }
    public static int countNobleIntegersWithDuplicates(int[] A) {
        int count = 0 ;
        int ans = 0 ;
        if (A[0] == 0) {
            ans++ ;
        }
        for (int i = 1 ; i < A.length ; i++) {
            if (A[i] != A[i - 1]) {
                count = i ;
            }
            if (count == A[i]) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]  A = { 1, -5, 3, 5, 5, -10, 4 };
        Arrays.sort(A);
        System.out.println(countNobleIntegers(A));
        int[] dup = {100, 1, 1, 3, -10};
        Arrays.sort(dup);
        System.out.println(countNobleIntegersWithDuplicates(dup));
    }
}
