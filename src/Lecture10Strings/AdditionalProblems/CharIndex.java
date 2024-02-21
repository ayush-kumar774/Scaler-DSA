package Lecture10Strings.AdditionalProblems;

public class CharIndex {
    public static String solve(String A) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < A.length() ; i++) {
            char currentChar = A.charAt(i);
            ans.append(currentChar);
            ans.append(currentChar - 'a' + 1);
        }
        return ans.toString();
    }



    public static void main(String[] args) {
        String str = "body";
        System.out.println(solve(str));
    }
}
