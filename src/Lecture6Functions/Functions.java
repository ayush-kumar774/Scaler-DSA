package Lecture6Functions;

import java.util.Scanner;

public class Functions {

    // Let's take 2 numbers as an input and return its sum.
    public static int add(int a, int b) {
        return a + b ;
    }

    // Given an integer N, return whether the integer is even or not.
    public static boolean evenOrNot(int a) {
        return a % 2 == 0;
    }

    // Given an integer N, return whether its height is small, medium or large.
    // if it is less than 10, then its small.
    // if it is between 10 to 20, then its medium.
    // if it is greater than 20, then large.
    public static void height(int a) {
        if (a < 10) System.out.println("Small");
        else if (a <= 20) System.out.println("Medium");
        else System.out.println("Large");
    }

    // Given two doubles as input, return the area of the rectangle.
    public static double areaOfRectangle(double length, double breadth) {
        return (length * breadth) ;
    }

    // Given the radius(double) of the circle, return the area of the circle.
    public static int areaOfCircle (double radius) {
        return (int)Math.ceil(Math.PI * radius * radius);
    }

    // given an integer N as an input, print all the prime number between 1 to N
    public static void isPrime (int num) {
        if (num == 1) return;
        boolean flag = false;
        for (int i = 2 ; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                flag = true ;
                break ;
            }
        }
        if (!flag) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(add(a, 10));
//        System.out.println(evenOrNot(a));
//        height(a);
//
//        double len = sc.nextDouble();
//        double bre = sc.nextDouble();
//        System.out.println(areaOfRectangle(len, bre));
//        double r = sc.nextDouble();
//        System.out.println(areaOfCircle(r));

        int num = sc.nextInt();
        for (int i = 1 ; i <= num ; i++) {
            isPrime(i);
        }
    }
}
