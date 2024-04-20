package Lecture7IntroductionTo2DMatrix.AdditionalProblems;

import static Lecture3IntroductionToArrays.Arrays.printArray;

public class RowSum {
    public static int[] solve(int[][] A) {
        int[] ans = new int[A.length];
        for (int row = 0 ; row < A.length ; row++) {
            for (int col = 0 ; col < A[0].length ; col++) {
                ans[row] += A[row][col];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}
        };
        int[] ans = solve(A) ;
        printArray(ans);
    }
}
/*
Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

1 <= A[i][j] <= 103



Input Format
First argument A is a 2D array of integers.(2D matrix).



Output Format
Return an array containing row-wise sums of original matrix.



Example Input
Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]


Example Output
Output 1:

[10,26,18]


Example Explanation
Explanation 1

Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18

 */