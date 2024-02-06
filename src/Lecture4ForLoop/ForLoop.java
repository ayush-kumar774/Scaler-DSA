package Lecture4ForLoop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        Given n print num from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Given n as input, print all the odd number from 1 to N
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Give n as input, print factor of the number n where n is a positive number
        for (int i = 1 ; i <= n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//        Given n as input, print if it is a prime number or not
        boolean flag = false ;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                flag = true ;
                break; // break statement
            }
        }
        if (flag) {
            System.out.println("Not Prime");

        } else {
            System.out.println("Prime Number");

        }

//        Scope

//        Case 1
//        int x = 10;
//        {
//            int y = 15 ;
//            System.out.println(x + " " + y);
//        }
//        {
//            System.out.println(x + " " + y);
//        }

//        Case 2
//        int x = 10;
//        {
//            int y = 15;
//            System.out.println(x + " " + y);
//        }
//        {
//            int y = 20;
//            System.out.println(x + " " + y);
//        }


    }
}
