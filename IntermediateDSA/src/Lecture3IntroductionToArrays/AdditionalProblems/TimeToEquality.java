package Lecture3IntroductionToArrays.AdditionalProblems;

public class TimeToEquality {
    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int k : A) {
            if (k > max) max = k;
        }
        int ans = 0 ;
        for (int j : A) {
            ans += (max - j);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = new int[] {2, 4, 1, 3, 2, 5} ;
        System.out.println(solve(A));
    }
}
