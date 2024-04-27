package Lecture10Strings.Assignment;

public class ToggleCase {
    public static String solve(String str) {
        char[] s = str.toCharArray();
        for (int i = 0 ; i < str.length() ; i++) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = (char) (s[i] + ('a' - 'A'));
            }

            else if (s[i] >= 'a' && s[i] <= 'z') {
                s[i] = (char) (s[i] - ('a' - 'A'));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : s) {
            ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "tHiSiSaStRiNg";

        System.out.println(solve(str));
        System.out.println(solve(str2));
    }
}
/*
Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format
First and only argument is a character string A.



Output Format
Return a character string.



Example Input
Input 1:

 A = "Hello"
Input 2:

 A = "tHiSiSaStRiNg"


Example Output
Output 1:

 hELLO
Output 2:

 ThIsIsAsTrInG


Example Explanation
Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".
 */