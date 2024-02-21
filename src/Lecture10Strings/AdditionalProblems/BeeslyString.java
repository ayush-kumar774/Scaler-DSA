package Lecture10Strings.AdditionalProblems;

public class BeeslyString {
    public static int solve(String A) {
        int counterA = 0 ;
        int counterB = 0 ;
        for (int i = 0 ; i < A.length() ; i++) {
            if (A.charAt(i) == 'p' || A.charAt(i) == 'a') {
                counterA++;
            }
            else {
                counterB++;
            }
        }
        if (counterA == counterB) {
            return 1 ;
        }
        else return 0;
    }

    public static void main(String[] args) {
        String ans = "mpampamm";
        System.out.println(solve(ans));
    }
}
