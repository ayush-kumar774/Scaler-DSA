package Lecture8Backtracking;

import java.util.ArrayList;

public class SubsetsAndSubsequences {
    public static void subsetsHelper(int[] A, ArrayList<Integer> curr, int index, ArrayList<ArrayList<Integer>> result) {
        int N = A.length;
        if (index == N) {
//            System.out.println(curr);
            result.add(new ArrayList<>(curr));
            return ;
        }
        subsetsHelper(A, curr, index + 1, result); //exclude
        curr.add(A[index]);
        subsetsHelper(A, curr, index + 1, result); // include
        curr.removeLast(); // removing last element for the included cases.
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        subsetsHelper(A, new ArrayList<>(), 0, result);
        return result;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(subsets(A));
    }
}
/*
Order matters is subsequence.
In subset order does not matter
Given an array with distinct integers, print all subsets using recursion.
 */