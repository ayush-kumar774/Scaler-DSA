package Lecture15Hashing2Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import static Lecture14HashingBasics.HashingBasics.prefixSum;

public class HashingProblems {
    public static void main(String[] args) {
        int[] A = {23,52,95,29,9,47,49,55,96,4};
        int k = 100;
        System.out.println(pairSumEqualsToK(A, k));
        int[] A2 = {2, 5, 2, 5, 8, 5, 2, 8};
        int k2 = 10;
        System.out.println(countPairSumEqualsToK(A2, k2));

        int[] A3 = {2, 5, 14, 10, 11, 16, 22, 24, 29};
        int k3 = 14;
        System.out.println(pairSubEqualToK(A3, k3));

        int[] A4 = {2, 3, 9, -4, 1, 5, 6, 2, 5};
        int k4 = 11;
        System.out.println(subArraySumEqualToK(A4, k4));

        int[] A5 = {1, 2, 4, 3, 1, 2, 1};
        int k5 = 4;
        System.out.println(Arrays.toString(distinctElementWithinTheWindow(A5, k5)));
    }

    private static int pairSumEqualsToK (int[] A, int k) {
        HashSet<Integer> seen = new HashSet<>();
        for (int a: A) {
            int b = k - a;

            if (seen.contains(b)) {
                return 1;
            }

            seen.add(a);
        }
        return 0;
    }

    private static int countPairSumEqualsToK(int[] A, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int counter = 0 ;
        for (int a: A) {
            int b = k - a;

            if (hashMap.containsKey(b)) {
                counter += hashMap.get(b);
            }

            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        return counter;
    }

    private static boolean pairSubEqualToK(int[] A, int k) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0 ; i < A.length; i++) {
            int b = A[i] - k;
            if (seen.contains(b)) {
                return true;
            }
            seen.add(A[i]);
        }
        return false;
    }

    private static int subArraySumEqualToK(int[] A, int k) {
        int[] prefixSum = prefixSum(A);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(0);
        int counter = 0 ;

        for (int p : prefixSum) {
            int b = p - k ;
            if (hashSet.contains(b)) {
                counter++;
            }
            hashSet.add(p);
        }
        return counter;
    }

    private static int[] distinctElementWithinTheWindow(int[] A, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0 ; i < k ; i++) {
            hashMap.put(A[i], hashMap.getOrDefault(A[i], 0) + 1);
        }

        int[] ans = new int[A.length - k + 1];
        ans[0] = hashMap.size();

        int s = 1;
        int e = k;

        while(e < A.length) {
            hashMap.put(A[e], hashMap.getOrDefault(A[e], 0) + 1);

            int oldValue = hashMap.get(A[s - 1]);
            if (oldValue == 1) {
                hashMap.remove(A[s - 1]);
            } else {
                hashMap.put(A[s - 1], oldValue - 1);
            }
            ans[s] = hashMap.size();

            s++;
            e++;
        }

        return ans;
    }
}
/*
Given an array A of size N and K. Check if there exist a pair(i, j)
where A[i] + A[j] = k and i != j.
 */