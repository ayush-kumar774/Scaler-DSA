package Lecture10Maths1ModularArithmeticAndGCD;

public class GCD {
    static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A % B);
    }

    public static void main(String[] args) {
        int A = 30;
        int B = 15 ;
        System.out.println(gcd(A, B));
    }
 }
