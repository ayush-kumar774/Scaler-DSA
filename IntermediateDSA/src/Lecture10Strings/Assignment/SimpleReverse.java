package Lecture10Strings.Assignment;

public class SimpleReverse {
    public static String solve(String A) {
        int n = A.length();
        StringBuilder ans = new StringBuilder();
        for (int i = n - 1 ; i >= 0 ; i--) {
            ans.append(A.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "scaler";
        System.out.println(solve(str));
        String str2 = "academy";
        System.out.println(solve(str2));
    }
}
/*
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.
 */