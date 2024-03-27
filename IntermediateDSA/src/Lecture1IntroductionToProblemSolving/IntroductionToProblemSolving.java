package Lecture1IntroductionToProblemSolving;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class IntroductionToProblemSolving {
    public static int countFactors(long n) {
        int counter = 0 ;
        for (long i = 1 ; i <= sqrt(n) ; i++) {
            if (n % i == 0) {
//                System.out.println(i + " " + (n / i));
                if (i == n / i) counter++;
                else counter += 2;
            }
        }
        return counter;
    }
    private static boolean isPrime(long n) {
        if (n <= 1) return false;
        for (int i = 2 ; i <= sqrt(n) ; i++) {
            if (n % i == 0) return false;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("The number of factors are " + countFactors(n));
        if (countFactors(n) == 2) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }
}
/*

 */