package Lecture11Maths2CombinatoricsBasics.Assignment;

public class SortedPermutationRank {
    private static final int MOD = 1000003;
    public static void main(String[] args) {
        String str1 = "acb";
        String str2 = "a";

        System.out.println(findRank(str1));
        System.out.println(findRank(str2));
    }
    private static int findRank(String A) {
        int n = A.length();

        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    count++;
                }
            }
            rank = (int) ((rank + count * factorial[n - i - 1]) % MOD);
        }

        return rank;
    }
}
/*
Problem Description
Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints
1 <= |A| <= 1000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank of the given string.



Example Input
Input 1:
A = "acb"

Input 2:
A = "a"


Example Output
Output 1:
2

Output 2:
1


Example Explanation
Explanation 1:
Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' :
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.

Explanation 2:
Given A = "a".
Rank is clearly 1.
 */
