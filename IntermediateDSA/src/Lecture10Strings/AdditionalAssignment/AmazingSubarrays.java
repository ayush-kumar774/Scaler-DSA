package Lecture10Strings.AdditionalAssignment;

public class AmazingSubarrays {
    public static boolean isVowel (char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static int solve(String str) {
        int count = 0 ;
        int mod = 10003 ;
        int n = str.length();
        for (int i  = 0 ; i < n ; i++) {
            if (isVowel(str.charAt(i))) {
                count = (count) % mod  + (n - i) % mod ;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        String str = "ABEC";
        System.out.println(solve(str));
    }
}
/*
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
 */