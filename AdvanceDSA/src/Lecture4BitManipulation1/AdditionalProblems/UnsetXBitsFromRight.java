package Lecture4BitManipulation1.AdditionalProblems;

public class UnsetXBitsFromRight {
    public static long solve(long A, int B) {
        for (int i = 0 ; i < B; i++){
            if ((A & (1L << i)) > 0) {
                A = (A ^ (1L << i));
            }
        }
        return A ;
    }

    public static void main(String[] args) {
        int a1 = 25;
        int a2 = 37;
        int a3 = 93;
        int b1 = 3;
        int b2 = 3;
        int b3 = 4;

        System.out.println(solve(a1, b1));
        System.out.println(solve(a2, b2));
        System.out.println(solve(a3, b3));
    }
}
/*
Problem Description
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to the decimal value 80.


Problem Constraints
1 <= A <= 1018
1 <= B <= 60


Input Format
The first argument is a single integer A.
The second argument is a single integer B.


Output Format
Return the number with B unset bits from the right.


Example Input
Input 1:-
A = 25
B = 3
Input 2:-
A = 37
B = 3


Example Output
Output 1:-
24
Output 2:-
32


Example Explanation
Explanation 1:-
A = 11001 to 11000

Explantion 2:-
A = 100101 to 100000
 */