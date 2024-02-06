package Lecture6Functions.AdditionalProblems;

public class CountOfPrimes {
    public int solve(int A) {
        int count = 0 ;
        for (int i = 2 ; i <= A ; i++) {
            boolean flag = false;
            for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    flag = true ;
                    break;
                }
            }
            if (!flag) count++ ;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
