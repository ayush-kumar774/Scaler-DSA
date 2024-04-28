package Lecture2Array2TwoDimensional.Assignment;

public class RowWithMaximumNumberOfOnes {
    public static int solve(int[][] A) {
        int n = A.length;
        int i = 0 , j = n - 1;
        int ans = -1 ;
        while (i < n && j >= 0) {
            if (A[i][j] == 1) {
                ans = i ;
                j--;
            }
            else {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] A = {
                {0, 1, 1},
                {0, 0, 1},
                {1, 1, 1}
        };
        System.out.println(solve(A));
    }
}
/*
Problem Description
Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.

NOTE:

If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).


Problem Constraints
1 <= N <= 1000

0 <= A[i] <= 1



Input Format
The only argument given is the integer matrix A.



Output Format
Return the row with the maximum number of 1.



Example Input
Input 1:

 A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
Input 2:

 A = [   [0, 0, 0, 0]
         [0, 0, 0, 1]
         [0, 0, 1, 1]
         [0, 1, 1, 1]    ]


Example Output
Output 1:

 0
Output 2:

 3


Example Explanation
Explanation 1:

 Row 0 has maximum number of 1s.
Explanation 2:

 Row 3 has maximum number of 1s.
 */