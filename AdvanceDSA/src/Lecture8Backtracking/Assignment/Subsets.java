package Lecture8Backtracking.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] a1 = {1};
        int [] a2 = {1, 2, 3};
        System.out.println(Arrays.deepToString(subsets(a1)));
        System.out.println(Arrays.deepToString(subsets(a2)));
    }
    public static int[][] subsets(int[] A) {
        Arrays.sort(A);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(A, 0, tempList, result);

        int[][] subsets = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            subsets[i] = new int[result.get(i).size()];
            for (int j = 0; j < result.get(i).size(); j++) {
                subsets[i][j] = result.get(i).get(j);
            }
        }
        return subsets;
    }

    private static void backtrack(int[] A, int start, List<Integer> tempList, List<List<Integer>> result) {
        result.add(new ArrayList<>(tempList));

        for (int i = start; i < A.length; i++) {
            tempList.add(A[i]);
            backtrack(A, i + 1, tempList, result);
            tempList.removeLast();
        }
    }
}
/*
Problem Description
Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The initial list is not necessarily sorted.


Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer.



Example Input
Input 1:
A = [1]

Input 2:
A = [1, 2, 3]


Example Output
Output 1:
[
    []
    [1]
]

Output 2:
[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.

 */