package Lecture11InterviewProblems.AdditionalProblems;

import java.util.Arrays;

public class CheckAnagrams {
    public static int solve(String A, String B) {
        if (A.length() != B.length()) {
            return 0 ;
        }
        char[] str = A.toCharArray();
        char[] str2 = B.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str2);

        for (int i = 0 ; i < A.length(); i++) {
            if (str[i] != str2[i]) {
                return 0 ;
            }
        }
        return 1 ;
    }
    public static void main(String[] args) {
        String A = "cat" ;
        String B = "bat" ;
        String A2 = "secure" ;
        String B2 = "rescue" ;
        System.out.println(solve(A, B));
        System.out.println(solve(A2, B2));
    }
}
