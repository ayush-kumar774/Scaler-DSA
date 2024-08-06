package Lecture14HashingBasics.AdditionalProblems;

import java.util.HashMap;

public class CountUniqueElements {
    public static void main(String[] args) {
        int[] A = {3, 3, 3, 9, 0, 1, 0};
        int[] B = {3, 4, 3, 6, 6};

        System.out.println(solve(A));
        System.out.println(solve(B));
    }

    private static int solve (int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : A) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        int counter = 0 ;
        for (int values : hashMap.values()) {
            if (values == 1) counter++;
        }
        return counter;
    }
}
/*
Problem Description
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First argument A is an array of integers.


Output Format
Return an integer.


Example Input

Input 1:
A = [3, 4, 3, 6, 6]

Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output

Output 1:
1

Output 2:
2


Example Explanation

Explanation 1:
Only element 4 has frequency 1.

Explanation 2:
Only elements 9 and 1 has frequency 1.
 */