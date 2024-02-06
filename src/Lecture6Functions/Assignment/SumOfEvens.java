package Lecture6Functions.Assignment;

public class SumOfEvens {
    public int solve (int A) {
        int sum = 0 ;
        for (int i = 2 ; i <= A; i += 2) {
            sum += i ;
        }
        return sum ;
    }
    public static void main(String[] args) {

    }
}
