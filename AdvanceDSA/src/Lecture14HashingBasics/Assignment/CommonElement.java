package Lecture14HashingBasics.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};

        int[] res = solve(A, B);
        System.out.println(Arrays.toString(res));
    }

    private static int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int a : A) {
            hashMap1.put(a, hashMap1.getOrDefault(a, 0) + 1);
        }

        for (int b : B) {
            hashMap2.put(b, hashMap2.getOrDefault(b, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap1.entrySet()) {
            int key = entry.getKey();

            if (hashMap2.containsKey(key)) {
                int min = Math.min(hashMap1.get(key), hashMap2.get(key));
                for (int i = 0; i < min; i++) {
                    res.add(key);
                }
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
/*
Problem Description
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input

Input 1:
A = [1, 2, 2, 1]
B = [2, 3, 1, 2]

Input 2:
A = [2, 1, 4, 10]
B = [3, 6, 2, 10, 10]


Example Output

Output 1:
[1, 2, 2]

Output 2:
[2, 10]


Example Explanation

Explanation 1:
Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.

Explanation 2:
Elements (2, 10) appears in both the array.
 */