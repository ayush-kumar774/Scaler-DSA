package Lecture8Backtracking.AdditionalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllUniquePermutations {
    public static void main(String[] args) {
        int[] A1 = {1, 1, 2};
        int[] A2 = {1, 2};
        int[][] ans = permute(A1);
        System.out.println(Arrays.deepToString(ans));
        ans = permute(A2);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] permute(int[] A) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(A);

        backtrack(A, new boolean[A.length], new ArrayList<>(), result);

        int[][] permutations = new int[result.size()][A.length];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> current = result.get(i);
            for (int j = 0; j < A.length; j++) {
                permutations[i][j] = current.get(j);
            }
        }

        return permutations;
    }

    private static void backtrack(int[] A, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == A.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (used[i] || (i > 0 && A[i] == A[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(A[i]);
            backtrack(A, used, current, result);
            current.removeLast();
            used[i] = false;
        }
    }
}
/*
Problem Description
Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= |A| <= 9

0 <= A[i] <= 10



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible unique permutation of the array.



Example Input
Input 1:
A = [1, 1, 2]

Input 2:
A = [1, 2]


Example Output
Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]
Output 2:

[ [1, 2]
  [2, 1] ]


Example Explanation
Explanation 1:

 All the possible unique permutation of array [1, 1, 2].
Explanation 2:

 All the possible unique permutation of array [1, 2].

 */