package Lecture11Maths2CombinatoricsBasics.Assignment;

public class ComputenCr {
    public static void main(String[] args) {
        int a1 = 5, b1 = 2, c1 = 13;
        int a2 = 6, b2 = 2, c2 = 13;
        System.out.println(solve(a1, b1, c1));
        System.out.println(solve(a2, b2, c2));
    }
    private static int solve(int A, int B, int C) {
        if (B > A) {
            return 0;
        }

        int[][] dp = new int[A + 1][B + 1];

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= Math.min(i, B); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % C;
                }
            }
        }

        return dp[A][B];
    }
}
/*
Problem Description
Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.

x! means factorial of x i.e. x! = 1 * 2 * 3... * x.



Problem Constraints
1 <= A * B <= 106

1 <= B <= A

1 <= C <= 106



Input Format
The first argument given is integer A ( = n).
The second argument given is integer B ( = r).
The third argument given is integer C ( = m).


Output Format
Return the value of nCr % m.



Example Input
Input 1:
A = 5
B = 2
C = 13

Input 2:
A = 6
B = 2
C = 13


Example Output
Output 1:
10

Output 2:
2


Example Explanation
Explanation 1:

 The value of 5C2 % 11 is 10.
Explanation 2:

 The value of 6C2 % 13 is 2.
 */
