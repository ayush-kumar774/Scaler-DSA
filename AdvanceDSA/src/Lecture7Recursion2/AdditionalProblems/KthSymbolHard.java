package Lecture7Recursion2.AdditionalProblems;

public class KthSymbolHard {
    public static void main(String[] args) {
        int a1 = 3, b1 = 0;
        int a2 = 4, b2 = 4;
        System.out.println(solve(a1, b1));
        System.out.println(solve(a2, b2));
    }
    private static int solve(int A, long B) {
        return findKthSymbol(A, B);
    }
    private static int findKthSymbol(int A, long B) {
        if (A == 1) {
            return 0;
        }
        long parentIndex = B / 2;
        int parentValue = findKthSymbol(A - 1, parentIndex);

        if (B % 2 == 0) {
            return parentValue;
        }
        else {
            return 1 - parentValue;
        }
    }
}
/*
Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).



Problem Constraints
1 <= A <= 105

0 <= B <= min(2A - 1 - 1 , 1018)



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer denoting the Bth indexed symbol in row A.



Example Input
Input 1:

 A = 3
 B = 0
Input 2:

 A = 4
 B = 4


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 1: 0
 Row 2: 01
 Row 3: 0110
Explanation 2:

 Row 1: 0
 Row 2: 01
 Row 3: 0110
 Row 4: 01101001
 */