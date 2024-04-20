package Lecture10Strings.Assignment;

public class LongestPalindromicSubstring {

    public static String longestOddLengthPalindromicString (String str) {
        int n = str.length();
        int max = 0 ;
        int maxL = 0 ;
        int maxR = 0;
        for (int i = 0 ; i < n ; i++) {
            int left = i ;
            int right = i ;
            while (left >= 0 && right < n) {
                if (str.charAt(left) != str.charAt(right)) {
                    break;
                }
                left-- ;
                right++;
            }
            int len = (right - left - 1) ;
            if (len > max) {
                maxL = left;
                maxR = right;
                max = len;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = maxL + 1; i < maxR; i++) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static String longestEvenLengthPalindromicString (String str) {
        int n = str.length();
        int max = 0 ;
        int maxL = 0 ;
        int maxR = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            int left = i ;
            int right = i + 1 ;
            if (str.charAt(left) == str.charAt(right)) {
                while (left >= 0 && right < n) {
                    if (str.charAt(left) != str.charAt(right)) {
                        break;
                    }
                    left-- ;
                    right++ ;
                }
                int len = (right - left);
                if (len > max) {
                    maxL = left;
                    maxR = right;
                    max = len;
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = maxL + 1 ; i < maxR;  i++) {
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "aaabaaa";
        String str2 = "abba" ;
        String odd = longestOddLengthPalindromicString(str);
        String odd2 = longestOddLengthPalindromicString(str2);
        String even = longestEvenLengthPalindromicString(str);
        String even2 = longestEvenLengthPalindromicString(str2);
        if (odd.length() > even.length()) {
            System.out.println(odd);
        } else {
            System.out.println(even);
        }
        if (odd2.length() > even2.length()) {
            System.out.println(odd2);
        } else {
            System.out.println(even2);
        }
    }
}
/*
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
Input 1:
A = "aaaabaaa"
Input 2:
A = "abba


Example Output
Output 1:
"aaabaaa"
Output 2:
"abba"


Example Explanation
Explanation 1:
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
Explanation 2:
We can see that longest palindromic substring is of length 4 and the string is "abba".
 */
