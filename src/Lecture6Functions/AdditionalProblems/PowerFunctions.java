package Lecture6Functions.AdditionalProblems;

public class PowerFunctions {
    public int power(final int A, final int B) {
        int ans = 1 ;
        for (int i = 1 ; i <= B ; i++) {
            ans *= A ;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
