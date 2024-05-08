package Lecture3Array3InterviewProblems.AdditionalProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int index = -1 ;
        int n = A.size();
        if (n == 1) return A ;
        for (int i = n - 2 ; i >= 0 ; i--) {
            if ((A.get(i) < A.get(i + 1))) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n - 1 ; i > index ; i--) {
            if (A.get(i) > A.get(index)) {
                int temp = A.get(index);
                A.set(index, A.get(i));
                A.set(i, temp);
                break;
            }
        }

        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>() ;
        A.add(2);
        A.add(1);
        A.add(5);
        A.add(4);
        A.add(3);
        A.add(0);
        A.add(0);
        A = nextPermutation(A);
        System.out.println(A);
    }
}
/*
Problem Description
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

If such an arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:

The replacement must be in place, do not allocate extra memory.
DO NOT USE LIBRARY FUNCTION FOR the NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.


Problem Constraints
1 <= N <= 5 * 105

1 <= A[i] <= 109



Input Format
The first and the only argument of input has an array of integers, A.



Output Format

Return an array of integers, representing the next permutation of the given array.



Example Input

Input 1:
A = [1, 2, 3]

Input 2:
A = [3, 2, 1]


Example Output

Output 1:
[1, 3, 2]

Output 2:
[1, 2, 3]


Example Explanation

Explanation 1:
Next permutation of [1, 2, 3] will be [1, 3, 2].
Explanation 2:

No arrangement is possible such that the number is arranged into the numerically next greater permutation of numbers.
So will rearrange it in the lowest possible order.
 */