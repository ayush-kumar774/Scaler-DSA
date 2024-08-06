package Lecture4BitManipulation1.Assignment;

public class SetBit {
    public static int solve(int A, int B){
        if (A == B) {
            return (1 << A);
        }
        else {
            return ((1 << A) + (1 << B));
        }
    }
    public static void main(String[] args) {
        int a = 3 ;
        int b = 5 ;
        int a1 = 4;
        int b1 = 4;
        System.out.println(solve(a, b));
        System.out.println(solve(a1, b1));
    }
}
/*
Problem Description
You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.


Problem Constraints
0 <= A <= 30
0 <= B <= 30


Input Format
First argument A is an integer.
Second argument B is an integer.


Output Format
Return an integer.


Example Input
Input 1:
A = 3
B = 5
Input 2:
A = 4
B = 4


Example Output
Output 1:
40
Output 2:
16


Example Explanation
For Input 1:
The binary expression is 101000 which is 40 in decimal.
For Input 2:
The binary expression is 10000 which is 16 in decimal
 */