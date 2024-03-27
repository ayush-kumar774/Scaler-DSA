package Lecture1IntroductionToProblemSolving.AdditionalProblems;

public class FindPerfectNumbers {
    public static int isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    sum += i ;
                }
                else {
                    sum += i ;
                    sum += (n / i) ;
                }
            }
        }
        if (sum == n) return 1 ;
        else return 0;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
