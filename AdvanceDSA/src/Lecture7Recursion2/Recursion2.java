package Lecture7Recursion2;

public class Recursion2 {
    public static int pow (int a, int n) {
        if (n == 0) {
            return 1 ;
        }
        else return a * pow(a , n - 1);
    }

    public static int pow2(int a, int n) {
        if (n == 0) {
            return 1 ;
        }
        int x = pow2(a, n / 2) ;

        if (n % 2 == 0) {
            return x * x ;
        }
        else {
            return a * x * x;
        }
//        if (n % 2 == 0) {
//            return pow2(a, n/2) * pow2(a , n / 2);
//        }
//        else {
//            return a * pow2(a , ((n - 1) / 2)) * pow2(a , ((n - 1) / 2));
//        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(pow2(2, 5));
    }


}
