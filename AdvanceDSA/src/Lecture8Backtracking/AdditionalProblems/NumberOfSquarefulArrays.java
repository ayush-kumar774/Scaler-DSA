package Lecture8Backtracking.AdditionalProblems;

import java.util.*;

public class NumberOfSquarefulArrays {
    public static void main(String[] args) {
        int[] A1 = {2, 2, 2};
        int[] A2 = {1, 17, 8};
        System.out.println(solve(A1));
        System.out.println(solve(A2));
    }
    private static boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    private static void generatePermutations(int[] A, boolean[] visited, List<Integer> current, Set<List<Integer>> result) {
        if (current.size() == A.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (visited[i]) continue;

            if (i > 0 && A[i] == A[i-1] && !visited[i-1]) continue;

            if (current.isEmpty() || isPerfectSquare(current.getLast() + A[i])) {
                visited[i] = true;
                current.add(A[i]);
                generatePermutations(A, visited, current, result);
                current.removeLast();
                visited[i] = false;
            }
        }
    }

    public static int solve(int[] A) {
        if (A.length == 1) return 0;

        Arrays.sort(A);
        Set<List<Integer>> result = new HashSet<>();
        boolean[] visited = new boolean[A.length];
        generatePermutations(A, visited, new ArrayList<>(), result);
        return result.size();
    }
}

/*
Problem Description
Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints
1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of permutations of A that are squareful.



Example Input
Input 1:
A = [2, 2, 2]

Input 2:
A = [1, 17, 8]


Example Output
Output 1:
1

Output 2:
2


Example Explanation
Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.
Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].
 */