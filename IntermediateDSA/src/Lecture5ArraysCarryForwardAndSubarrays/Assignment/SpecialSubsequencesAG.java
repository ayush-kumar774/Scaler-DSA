package Lecture5ArraysCarryForwardAndSubarrays.Assignment;

public class SpecialSubsequencesAG {
    public static int countSubsequenceAG(String str) {
        int mod = 1000000007;
        int count = 0 ;
        int countA = 0 ;
        for(int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                countA++;
            }
            else if (str.charAt(i) =='G') {
                count += ((countA) % mod);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "ABCGAG";
        System.out.println(countSubsequenceAG(str));
    }
}
/*
Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string
Explanation 2:

 There is no subsequence "AG" in the given string.
 */
