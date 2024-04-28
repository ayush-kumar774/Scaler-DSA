package Lecture1Arrays1OneDimensional.AdditionalProblems;

public class Flip {
    public static int[] flip (String A) {
        int maxEndingHere = 0;
        int maxSoFar = 0;
        int start = -1;
        int end = -1;
        int bestStart = -1;
        int bestEnd = -1;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '0') {
                if (maxEndingHere == 0) {
                    start = i + 1;
                }
                maxEndingHere++;
                if (maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                    end = i + 1;
                    bestStart = start;
                    bestEnd = end;
                } else if (maxEndingHere == maxSoFar && start < bestStart) {
                    bestStart = start;
                    bestEnd = end;
                }
            } else {
                maxEndingHere = 0;
            }
        }

        if (maxSoFar == 0) {
            return new int[0];
        }

        return new int[]{bestStart, bestEnd};
    }

    public static void main(String[] args) {
        String a = "010";
        String b = "111";
        String c = "1111000100001";
        int[] ans1 = flip(a);
        int[] ans2 = flip(b);
        int[] ans3 = flip(c);
        printArray(ans1);
        printArray(ans2);
        printArray(ans3);
    }
    private static void printArray(int[] A) {
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
/*
Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints
1 <= size of string <= 100000



Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

[1, 1]
Output 2:

[]


Example Explanation
Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].
 */