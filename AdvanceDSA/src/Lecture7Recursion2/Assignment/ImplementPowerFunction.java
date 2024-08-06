package Lecture7Recursion2.Assignment;

public class ImplementPowerFunction {
    public static int pow(int A, int B, int C) {
        if (B == 0) {
            return 1 % C;
        }
        long x = pow(A, B / 2 , C) % C;
        x = (x * x) % C;

        if (B % 2 == 0) {
            return (int)x;
        } else {
            return (int)((x * (A % C)) % C + C) % C;
        }

    }

    public static void main(String[] args) {
        System.out.println(pow(-1, 1, 20));
    }
}
/*
Problem Description
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.


Problem Constraints
-109 <= A <= 109
0 <= B <= 109
1 <= C <= 109


Input Format
Given three integers A, B, C.


Output Format
Return an integer.


Example Input
Input 1:
A = 2
B = 3
C = 3
Input 2:
A = 3
B = 3
C = 1


Example Output
Output 1:
2
Output 2:
0


Example Explanation
Explanation 1:
23 % 3 = 8 % 3 = 2
Explanation 2:
33 % 1 = 27 % 1 = 0
 */