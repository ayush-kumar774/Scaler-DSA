package Lecture8Backtracking.AdditionalProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 2};
        int[] A2 = {1, 1};

        int[][] res = subsetsWithDup(A1);
        System.out.println(Arrays.deepToString(res));
        res = subsetsWithDup(A2);
        System.out.println(Arrays.deepToString(res));
    }
    public static int[][] subsetsWithDup(int[] A) {
        Arrays.sort(A);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(A, 0, new ArrayList<>(), result);
        int[][] output = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> subset = result.get(i);
            output[i] = subset.stream().mapToInt(Integer::intValue).toArray();
        }
        return output;
    }

    private static void backtrack(int[] A, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < A.length; i++) {
            if (i > start && A[i] == A[i - 1]) continue;

            current.add(A[i]);
            backtrack(A, i + 1, current, result);
            current.removeLast();
        }
    }
}
/*
Problem Description
Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.


Problem Constraints
0 <= N <= 16



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D vector denoting all the possible subsets.



Example Input
Input 1:
A = [1, 2, 2]

Input 2:
A = [1, 1]


Example Output
Output 1:
[
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]

Output 2:
[
    [],
    [1],
    [1, 1]
 ]


Example Explanation
Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.
 */