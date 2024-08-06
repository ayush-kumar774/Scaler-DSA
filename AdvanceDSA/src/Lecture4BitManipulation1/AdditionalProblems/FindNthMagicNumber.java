package Lecture4BitManipulation1.AdditionalProblems;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        int a1 = 3;
        int a2 = 10;
        System.out.println(nthMagicNumber(a1));
        System.out.println(nthMagicNumber(a2));
    }
    private static int nthMagicNumber(int A) {
        int result = 0;
        int powerOf5 = 5;

        while (A > 0) {
            if ((A & 1) == 1) {
                result += powerOf5;
            }
            powerOf5 *= 5;
            A >>= 1;
        }
        return result;
    }
}
/*
Problem Description
Given an integer A, find and return the Ath magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….



Problem Constraints
1 <= A <= 5000



Input Format
The only argument given is integer A.



Output Format
Return the Ath magic number.



Example Input
Example Input 1:

 A = 3
Example Input 2:

 A = 10


Example Output
Example Output 1:
30

Example Output 2:
650


Example Explanation
Explanation 1:

 Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 3rd element in this is 30
Explanation 2:

 In the sequence shown in explanation 1, 10th element will be 650.
 */
