package Lecture14HashingBasics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class HashingBasics {
    public static void main(String[] args) {
        int[] A = {2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6};
        int[] Q = {2, 6, 3, 8, 10};
        int[] result = findFrequency(A, Q);
        System.out.println(Arrays.toString(result));

        int[] N1 = {1, 2, 3, 1, 2, 5};
        int[] N2 = {4, 3, 3, 2, 5, 6, 4, 5};
        int[] N3 = {2, 6, 8, 4, 7, 2, 9};
        System.out.println(firstNonRepeatingElement(N1));
        System.out.println(firstNonRepeatingElement(N2));
        System.out.println(firstNonRepeatingElement(N3));

        int[] nums1 = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int[] nums2 = {-2, -1, 3, 5};
        int[] nums3 = {-2, -1, 4};
        System.out.println(checkSubArrayWithSumZero(nums1));
        System.out.println(checkSubArrayWithSumZero(nums2));
        System.out.println(checkSubArrayWithSumZero(nums3));

        int[] learners = {103, 101, 102, 104, 105, 106, 101, 102, 105, 101, 105};
        System.out.println(numberWithLessFrequency(learners));
    }

    private static int[] findFrequency(int[] A, int[] Q) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int a : A) {
//            if (hashMap.containsKey(a)) {
//                hashMap.put(a, hashMap.get(a) + 1);
//            }
//            else {
//                hashMap.put(a, 1);
//            }
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);

        }
        int[] frequency = new int[Q.length];
        for (int i = 0; i < Q.length; i++) {
//            frequency[i] = hashMap.get(Q[i]);
            frequency[i] = hashMap.getOrDefault(Q[i], 0);
        }
        return frequency;
    }

    private static int firstNonRepeatingElement(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        for (int a : A) {
            if (hashMap.get(a) == 1) {
                return a;
            }
        }
        return -1;
    }

    public static int[] prefixSum(int[] A) {
        int[] prefixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        return prefixSum;
    }

    private static boolean checkSubArrayWithSumZero(int[] A) {
        int[] prefixSum = prefixSum(A);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(0);

        for (int a : prefixSum) {
            if (hashSet.contains(a)) {
                return true;
            } else {
                hashSet.add(a);
            }
        }

        return false;
    }

    private static int numberWithLessFrequency(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int counter = 0;

        for (int value : hashMap.values()) {
            if (value < min) {
                min = value;
                counter = 1; // Reset counter as we found a new minimum
            } else if (value == min) {
                counter++;
            }
        }
        return counter;
    }
}
/*
Given N elements and Q queries. Find the frequency of elements provided in the query.
 */
/*
Given N elements find the first non-repeating element.
 */