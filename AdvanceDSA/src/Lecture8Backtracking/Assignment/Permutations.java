package Lecture8Backtracking.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(Arrays.deepToString(permute(A)));
    }
    public static int[][] permute(int[] A) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        boolean[] used = new boolean[A.length];
        backtrack(A, used, tempList, result);

        int[][] permutations = new int[result.size()][A.length];
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < A.length; j++) {
                permutations[i][j] = result.get(i).get(j);
            }
        }
        return permutations;
    }

    private static void backtrack(int[] A, boolean[] used, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == A.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (!used[i]) {
                tempList.add(A[i]);
                used[i] = true;
                backtrack(A, used, tempList, result);
                tempList.remove(tempList.size() - 1);
                used[i] = false;
            }
        }
    }
}
/*
Problem Description
Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS.
Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= N <= 9



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible permutation of the array.



Example Input
A = [1, 2, 3]


Example Output
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]


Example Explanation
All the possible permutation of array [1, 2, 3].
 */