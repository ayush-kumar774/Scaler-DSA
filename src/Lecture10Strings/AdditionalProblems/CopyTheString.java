package Lecture10Strings.AdditionalProblems;

public class CopyTheString {
    public static String solve(final String A) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < (A.length() - 1) ; i++) {
            ans.append(A.charAt(i));
        }
        return  ans.toString();
    }
    public static void main(String[] args) {
        String str = "interviewbit";
        System.out.println(solve(str));
    }
}
