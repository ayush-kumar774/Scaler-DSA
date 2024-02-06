package Lecture6Functions.AdditionalProblems;

public class IsPerfectSquare {
    public int solve(int A) {
        int sq = (int)Math.sqrt(A);
        if (sq * sq == A) return 1 ;
        else return 0 ;
    }

    public static void main(String[] args) {

    }
}
