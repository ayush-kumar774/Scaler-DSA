package Lecture10Strings.Assignment;


public class ReverseTheString {
    public static String reverseString(String A) {
        String [] str = A.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = str.length - 1 ; i >= 0 ; i--) {
            if (!str[i].isEmpty()) {
                ans.append(str[i]);
                if (i != 0) {
                    ans.append(" ");
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = " bwroafq rfmy eimspekey w wnzjh qisjiabv ya hncn mazvb pfwlcsnkqz muiapt nnvwwx rp bsypbqu ymg bjwapykfil";
        System.out.println(reverseString(str));
    }
}
/*
Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output
Output 1:
"blue is sky the"
Output 2:
"ib is this"


Example Explanation
Explanation 1:
We reverse the string word by word so the string becomes "blue is sky the".
Explanation 2:
We reverse the string word by word so the string becomes "ib is this".


 */